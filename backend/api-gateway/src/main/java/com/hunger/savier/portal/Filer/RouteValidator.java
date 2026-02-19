package com.hunger.savier.portal.Filer;



import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Predicate;

@Component
public class RouteValidator {

    public static final List<String> openApiEndpoints = List.of(
            "/auth/login",
            "/auth/signup",
            "/auth/validate"

    );

    public final Predicate<ServerHttpRequest> publicEndpoints =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri->request.getURI().getPath().contains(uri) );

}
