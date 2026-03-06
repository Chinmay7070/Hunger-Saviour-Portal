package com.hunger.savier.portal.order_service.service;

import com.hunger.savier.portal.payment_service.dtoes.OrderDto;

import java.util.List;

public interface OrderService {

    void createOrder(OrderDto orderDto);
   List<OrderDto> getOrdersByUsername(String userName);
}
