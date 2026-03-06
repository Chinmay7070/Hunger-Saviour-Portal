package com.hunger.savier.portal.payment_service.repository;

import com.hunger.savier.portal.payment_service.eitites.PaymentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PaymentRepository extends CrudRepository<PaymentEntity, UUID> {

}