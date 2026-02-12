package com.hunger.restaurant.utilites;

import com.hunger.restaurant.dtoes.RestaurantDTO;
import com.hunger.restaurant.entities.RestaurantEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE = Mappers.getMapper(RestaurantMapper.class);
    RestaurantDTO entityToDTO(RestaurantEntity entity);
}
