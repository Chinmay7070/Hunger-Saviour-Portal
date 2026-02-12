package com.hunger.savier.portal.apis;

import com.hunger.savier.portal.dtoes.LoginRequestDto;
import com.hunger.savier.portal.dtoes.SignUpRequestDTO;
import com.hunger.savier.portal.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth")
public class Authapi {

    private final UserService userService;

   @PostMapping("login")
    public String login(@RequestBody LoginRequestDto loginRequestDto){
       return null;
   }
   @PostMapping("signup")
    public ResponseEntity<String> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO){
       return new ResponseEntity<>(userService.signUp(signUpRequestDTO), HttpStatus.CREATED);
   }

}
