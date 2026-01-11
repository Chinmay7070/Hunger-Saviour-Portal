package com.hunger.restaurant.Services;

import com.hunger.restaurant.entities.RestaurantEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IRestaurantService {

  public Page<RestaurantEntity> getRestaurants(int pageNumber, int pageSize );
  public List<RestaurantEntity> getAllRestaurants( );
}
