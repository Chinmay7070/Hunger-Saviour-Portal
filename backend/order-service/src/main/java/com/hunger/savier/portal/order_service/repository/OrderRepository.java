package com.hunger.savier.portal.order_service.repository;

import com.hunger.savier.portal.order_service.entities.OrderEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface OrderRepository extends CrudRepository<OrderEntity, UUID> {


    Optional<List<OrderEntity>> findByUserName(String username);
}
