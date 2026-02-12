package com.hunger.restaurant.apis;

import com.ctc.wstx.io.ReaderSource;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hunger.restaurant.Repository.RestaurantRepo;
import com.hunger.restaurant.Services.IRestaurantService;
import com.hunger.restaurant.dtoes.RestaurantDTO;
import com.hunger.restaurant.entities.RestaurantEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.domain.Page;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class RestaurantAPI {


  private final IRestaurantService restaurantService;

  @GetMapping("/{pageNumber}/{pageSize}")
  public Page<RestaurantEntity> getRestaurant(
    @PathVariable("pageNumber") Integer pageNumber,
    @PathVariable("pageSize") Integer pageSize) {

    return restaurantService.getRestaurants(pageNumber, pageSize);
  }

  @GetMapping
  public List<RestaurantDTO> getAllRestaurant()
  {
       return this.restaurantService.getAllRestaurants();
  }


 /* private final ResourceLoader resourceLoader;
  private final RestaurantRepo restaurantRepo;

  @GetMapping("/load")
  public String loadRestaurantsInDatabase() throws Exception{

    Resource resource = resourceLoader.getResource("classpath:"+"restaurants.json");
    try(InputStreamReader reader = new InputStreamReader(resource.getInputStream() , StandardCharsets.UTF_8)){
     String data =  FileCopyUtils.copyToString(reader);
    List<RestaurantEntity> restaurantEntities =  objectMapper.readValue(data, new TypeReference<List<RestaurantEntity>>() {
     });
     this.restaurantRepo.saveAll(restaurantEntities);
    }
     return "record Inserted";

  }*/
}
