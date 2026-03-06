package com.hunger.savier.portal.payment_service.broker;

import com.hunger.savier.portal.payment_service.dtoes.OrderDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "order-service")
public interface OrderBroker {

    @PostMapping
    public ResponseEntity<?> createOrder(OrderDto orderDto);
}
