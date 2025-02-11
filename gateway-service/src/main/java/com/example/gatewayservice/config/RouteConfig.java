//package com.example.gatewayservice.config;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RouteConfig {
//    @Bean
//    public RouteLocator getwayRouteLoucator(RouteLocatorBuilder builder){
//        return builder.routes().
//                route(r->r.path("/customer/**").
//                        uri("lb://CUSTOMER-SERVICE/**")).
//                route(r->r.path("/product/**").uri("lb://PRODUCT-SERVICE/**"))
//                .build();
//    }
//
//}
