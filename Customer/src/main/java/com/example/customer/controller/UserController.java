package com.example.customer.controller;

import com.example.customer.entity.User;
import com.example.customer.proxy.GetProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RefreshScope
public class UserController {
    private  final GetProduct getProduct;
    @Value("${param.customer.a}")
    private String param1;
    @GetMapping("/users")
    public String getUsers(){
        System.out.println(param1);
        User user=getProduct.getUser();
        System.out.println(user.getName());


        return "Customer";
    }
}
