package com.hunger.restaurant.Repository;

import com.hunger.restaurant.entities.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RestaurantRepo extends JpaRepository<RestaurantEntity,Integer> {

}
