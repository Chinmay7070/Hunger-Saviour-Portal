package com.hunger.savier.portal.payment_service.services.Impl;

import com.hunger.savier.portal.payment_service.broker.OrderBroker;
import com.hunger.savier.portal.payment_service.dtoes.OrderDto;
import com.hunger.savier.portal.payment_service.eitites.PaymentEntity;
import com.hunger.savier.portal.payment_service.eitites.PaymentStatus;
import com.hunger.savier.portal.payment_service.repository.PaymentRepository;
import com.hunger.savier.portal.payment_service.services.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final OrderBroker orderBroker;

    @Override
    public void processPayment(OrderDto orderDto) {
      com.hunger.savier.portal.payment_service.eitites.PaymentEntity paymentEntity =  PaymentEntity.builder()
                .paymentStatus(PaymentStatus.PAYMENT_SUCCESS)
                .transactionId(orderDto.getTransactionId())
                .userName(orderDto.getUserName())
                .localDateTime(LocalDateTime.now())
                .build();
      this.paymentRepository.save(paymentEntity);

      //Make a call to order Service to create Order. Use kafka if needded
        orderDto.setPaymentId(paymentEntity.getPaymentId());
        this.orderBroker.createOrder(orderDto);

    }
}
