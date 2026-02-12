package com.hunger.savier.portal.reposetories;

import com.hunger.savier.portal.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<UserEntity,Integer> {

   Optional<UserEntity> findByUsername(String username);
}
