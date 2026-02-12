package com.hunger.savier.portal.services;

import com.hunger.savier.portal.dtoes.SignUpRequestDTO;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {

    public String signUp( SignUpRequestDTO signUpRequestDTO);
}
