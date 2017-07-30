package com.boke.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @RequestMapping("/product/{productId}")
    public String productDetails(@PathVariable("productId") String productId) {
        return "product-details";
    }

}
