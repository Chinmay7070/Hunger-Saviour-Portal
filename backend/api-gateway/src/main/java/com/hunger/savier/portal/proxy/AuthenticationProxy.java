package com.hunger.savier.portal.proxy;

import com.hunger.savier.portal.dtos.AuthRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

@Component
@RequiredArgsConstructor
public class AuthenticationProxy {
    private  final  WebClient.Builder webClientBuilder;

    public Mono<String> getToken(AuthRequest authRequest){
         return webClientBuilder
                 .build()
                 .post()
                 .uri("http://user-service/auth/login")
                 .contentType(MediaType.APPLICATION_JSON)
                 .bodyValue(authRequest)
                 .retrieve()
                 .bodyToMono(String.class)
                 .subscribeOn(Schedulers.boundedElastic());
    }

    public Mono<Boolean> validateToken(String token){
        return webClientBuilder.build().get()
                .uri("http://user-service/auth/validate?token"+token)
                .retrieve()
                .bodyToMono(Boolean.class)
                .subscribeOn(Schedulers.boundedElastic());
    }

}
