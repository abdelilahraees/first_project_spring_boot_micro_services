package com.example.customer.proxy;

import com.example.customer.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
@Service
@FeignClient(name = "PRODUCT-SERVICE",path = "/product")
public interface GetProduct {
    @GetMapping("/products")
    User getUser();
}
