package com.hunger.savier.portal.apis;

import com.hunger.savier.portal.dtoes.LoginRequestDto;
import com.hunger.savier.portal.dtoes.SignUpRequestDTO;
import com.hunger.savier.portal.services.TokenService;
import com.hunger.savier.portal.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth")
public class Authapi {

    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;
   @PostMapping("login")
    public String login(@RequestBody LoginRequestDto loginRequestDto){
      Authentication authentication =  authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
               loginRequestDto.getUsername(),
               loginRequestDto.getPassword()
       ));
       System.out.println(authentication.getPrincipal());
       return tokenService.generateTokens(authentication);
   }
   @PostMapping("signup")
    public ResponseEntity<String> signUp(@RequestBody SignUpRequestDTO signUpRequestDTO){
       return new ResponseEntity<>(userService.signUp(signUpRequestDTO), HttpStatus.CREATED);
   }

}
