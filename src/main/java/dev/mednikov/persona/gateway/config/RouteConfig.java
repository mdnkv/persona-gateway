package dev.mednikov.persona.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator getRouteLocator (RouteLocatorBuilder builder){
        return builder.routes()
                .route(r -> r.path("/personas/**").uri("http://localhost:8001"))
                .route(r -> r.path("/chats/**").uri("http://localhost:8002"))
                .build();
    }
}
