package com.example.demo.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMain {

    @GetMapping("/products")
    public User A(){


        User user =new User("ssss");
        return user;
    }
}
