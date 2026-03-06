package com.hunger.savier.portal.order_service.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID orderId;
    @Column(name = "payment_id")
    private UUID paymentId;
    @Column(name = "txn_id")
    private String transactionId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "amount_paid")
    private Double amountPaid;
    @Column(name = "order_create_date_time")
    private LocalDateTime orderCreatedTime;
    @Column(name = "order_status")
    private String orderStatus;
}
