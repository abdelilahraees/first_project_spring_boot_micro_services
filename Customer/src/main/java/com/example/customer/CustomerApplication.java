package com.example.customer;

import com.example.customer.entity.Product;
import com.example.customer.repository.ProductRepo;
import com.example.customer.repository.ProductRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepo productRepo){
            return args2 -> {
            productRepo.save(new Product("Product 1", 10.0));
            productRepo.save(new Product("Product 2", 20.0));
            productRepo.save(new Product("Product 3", 30.0));

            System.out.println("Product List:");
            for (Product product : productRepo.findAll()) {
                System.out.println(product);
            }
        };
    }


}
