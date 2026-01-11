package com.hunger.restaurant.dtoes;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantmenuDTO {

  private Integer restaurantMenuId;

  private String menuItem;

  private String description;

  private String menuImageUrl;

  private String menuType;

  private Double price;
}

