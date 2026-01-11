package com.hunger.restaurant.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "restaurant_menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantMenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Integer restaurantMenuId;

    @Column(name = "item_name")
    private String menuItem;

    @Column(name = "description" , length = 1000)
    private String description;

    @Column(name = "menu_image_url")
    private String menuImageUrl;

    @Column(name = "menu_type")
    private String menuType;

    @Column(name = "price ")
    private Double price;
}
