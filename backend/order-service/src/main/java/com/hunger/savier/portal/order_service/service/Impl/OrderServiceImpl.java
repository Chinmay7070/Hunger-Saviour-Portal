package com.hunger.savier.portal.order_service.service.Impl;

import com.hunger.savier.portal.order_service.entities.OrderEntity;
import com.hunger.savier.portal.order_service.repository.OrderRepository;
import com.hunger.savier.portal.order_service.service.OrderService;
import com.hunger.savier.portal.payment_service.dtoes.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    public void createOrder(OrderDto orderDto) {
      OrderEntity orderEntity =   OrderEntity.builder()
                .transactionId(orderDto.getTransactionId())
                .userName(orderDto.getUserName())
                .paymentId(orderDto.getOrderId())
                .orderCreatedTime(LocalDateTime.now())
                .orderStatus("DELIVERED")
                .amountPaid(orderDto.getAmountPaid())
                .build();
        this.orderRepository.save(orderEntity);

    }

    @Override
    public List<OrderDto> getOrdersByUsername(String userName) {

        Optional<List<OrderEntity>> ordersOptional =
                this.orderRepository.findByUserName(userName);

        return ordersOptional
                .map(orders -> orders.stream()
                        .map(order -> OrderDto.builder()
                                .orderId(order.getOrderId())
                                .paymentId(order.getPaymentId())
                                .userName(order.getUserName())
                                .orderCreatedTime(order.getOrderCreatedTime())
                                .transactionId(order.getTransactionId())
                                .amountPaid(order.getAmountPaid())
                                .orderStatus(order.getOrderStatus())
                                .build())
                        .toList())
                .orElse(Collections.emptyList());
    }
}
