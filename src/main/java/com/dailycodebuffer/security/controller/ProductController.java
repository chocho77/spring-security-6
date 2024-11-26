package com.dailycodebuffer.security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private record Product(Integer productId, 
                           String productName, 
                           double price){}
    
    List<Product> products = new ArrayList<>(
        List.of(
            new Product(1, "iPhone", 999.0),
            new Product(1, "Mac Pro", 2099.0)
        )
    );

    @PostMapping
    public List<Product> getProducts() {
        return products;
    }



}
