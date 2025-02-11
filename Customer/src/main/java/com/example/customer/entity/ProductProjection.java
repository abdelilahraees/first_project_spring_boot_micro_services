package com.example.customer.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(types =Product.class,name = "all")
public interface ProductProjection {
    public Long getId() ;
    public String getName();


}
