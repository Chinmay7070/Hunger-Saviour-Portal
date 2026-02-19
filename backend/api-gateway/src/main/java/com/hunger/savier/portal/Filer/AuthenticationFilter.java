package com.hunger.savier.portal.Filer;

import com.hunger.savier.portal.handlers.UnauthorizedException;
import com.hunger.savier.portal.proxy.AuthenticationProxy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Component
@Slf4j
public class AuthenticationFilter extends AbstractGatewayFilterFactory<AuthenticationFilter.Config> {

    @Autowired
    private RouteValidator validator;
    @Autowired
    private  AuthenticationProxy authenticationProxy;

   public AuthenticationFilter(RouteValidator validator , AuthenticationProxy authenticationProxy){
       super(Config.class);
       this.authenticationProxy = authenticationProxy;
       this.validator = validator;
   }

    @Override
    public GatewayFilter apply(AuthenticationFilter.Config config) {
        return ((exchange, chain) -> {
            log.info("Received Request :" + exchange.getRequest().toString());
            if (validator.publicEndpoints.test(exchange.getRequest())){
                if (!exchange.getRequest().getHeaders().containsKey(HttpHeaders.AUTHORIZATION)){
                    throw new UnauthorizedException("Missing Authorization headers");
                }
              String authHeader =  Objects.requireNonNull(exchange.getRequest()
                        .getHeaders().get(HttpHeaders.AUTHORIZATION)).get(0);
              if (authHeader != null && authHeader.startsWith("Bearer ")){
                  authHeader = authHeader.substring(7);
              }
              log.info("Received token :" + authHeader);
              return validateToken(authHeader)
                      .flatMap(valid -> {
                          if(Boolean.TRUE.equals(valid)){
                              log.info("Valid token received");
                              return chain.filter(exchange);
                          }
                          else {
                              log.info("Token Validation Fail");
                              ServerHttpResponse response = exchange.getResponse();
                              return response.setComplete();
                          }
                      });
            }
            return chain.filter(exchange);

        });
    }

    public static class Config{
        //Empty class for Congiguration if needed
    }
    private Mono<Boolean> validateToken(String token){
       log.info("Validation token :" + token);
       return  authenticationProxy.validateToken(token);
    }
}
