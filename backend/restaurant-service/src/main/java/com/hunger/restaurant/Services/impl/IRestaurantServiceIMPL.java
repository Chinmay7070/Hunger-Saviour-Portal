package com.hunger.restaurant.Services.impl;

import com.hunger.restaurant.Repository.RestaurantRepo;
import com.hunger.restaurant.Services.IRestaurantService;
import com.hunger.restaurant.dtoes.RestaurantDTO;

import com.hunger.restaurant.entities.RestaurantEntity;

import com.hunger.restaurant.utilites.RestaurantMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class IRestaurantServiceIMPL implements IRestaurantService {

    private final RestaurantRepo restaurantRepo;

    @Override
    public Page<RestaurantEntity> getRestaurants(int pageNumber, int pageSize) {
        Page<RestaurantEntity> restaurants = this.restaurantRepo.findAll(PageRequest.of(pageNumber, pageSize));
        return restaurants;
    }

    @Override
    public List<RestaurantDTO> getAllRestaurants() {
       List<RestaurantEntity> restaurantEntities = restaurantRepo.findAll();
       return  restaurantEntities.stream().map(RestaurantMapper.INSTANCE::entityToDTO).collect(Collectors.toList());
    }
}
