package com.hunger.savier.portal.payment_service.services;

import com.hunger.savier.portal.payment_service.dtoes.OrderDto;

public interface PaymentService {
    void processPayment(OrderDto orderDto);
}
