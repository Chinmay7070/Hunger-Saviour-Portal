package com.hunger.restaurant.Services.impl;

import com.hunger.restaurant.Repository.RestaurantRepo;
import com.hunger.restaurant.Services.IRestaurantService;
import com.hunger.restaurant.entities.RestaurantEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class IRestaurantServiceIMPL implements IRestaurantService {

  private final RestaurantRepo restaurantRepo;

  @Override
  public  Page<RestaurantEntity>  getRestaurants(int pageNumber, int pageSize) {
      Page<RestaurantEntity> restaurants = this.restaurantRepo.findAll(PageRequest.of(pageNumber,pageSize));
      return restaurants;
  }

  @Override
  public List<RestaurantEntity> getAllRestaurants() {
    return restaurantRepo.findAll();
  }
}
