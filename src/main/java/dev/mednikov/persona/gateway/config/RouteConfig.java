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
                .route("personas", r -> r.path("/personas/**").uri("lb://persona-personas"))
                .route("chats", r -> r.path("/chats/**").uri("lb://persona-chats"))
                .build();
    }
}
