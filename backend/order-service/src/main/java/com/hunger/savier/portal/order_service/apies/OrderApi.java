package com.hunger.savier.portal.order_service.apies;

import com.hunger.savier.portal.order_service.service.OrderService;
import com.hunger.savier.portal.payment_service.dtoes.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderApi {

    private final OrderService orderService;
    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody OrderDto orderDto){
        this.orderService.createOrder(orderDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping("/{username}")
    public ResponseEntity<List<OrderDto>> getOrders(@PathVariable String username){
        return new ResponseEntity<>(orderService.getOrdersByUsername(username),HttpStatus.OK);

    }
}
