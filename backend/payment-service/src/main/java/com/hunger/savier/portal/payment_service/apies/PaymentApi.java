package com.hunger.savier.portal.payment_service.apies;

import com.hunger.savier.portal.payment_service.dtoes.OrderDto;
import com.hunger.savier.portal.payment_service.services.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payments")
@RequiredArgsConstructor
@Slf4j
public class PaymentApi {

    private final PaymentService paymentService;

    @PostMapping
    public ResponseEntity<?> processPayment(@RequestBody OrderDto orderDto){
        log.info("Entered in to Payment Api with Date :"+orderDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
