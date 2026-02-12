package com.hunger.savier.portal.services.UsersIMPL;

import com.hunger.savier.portal.dtoes.SignUpRequestDTO;
import com.hunger.savier.portal.entities.RoleEntity;
import com.hunger.savier.portal.entities.UserEntity;
import com.hunger.savier.portal.reposetories.UserRepo;
import com.hunger.savier.portal.services.UserService;
import java.util.List;
import java.util.ArrayList;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceIMpl implements UserService {

    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String signUp(SignUpRequestDTO signUpRequestDTO) {

        List<RoleEntity> roles = new ArrayList<>();
        roles.add(new RoleEntity("Admin"));

        UserEntity userEntity = UserEntity.builder()
                .username(signUpRequestDTO.getUsername())
                .password(passwordEncoder.encode(signUpRequestDTO.getPassword()))
                .roles(roles)
                .mobileNumber(signUpRequestDTO.getMobileNumber())
                .build();

        userRepo.save(userEntity);
        return "User Created Successfully";
    }

}
