package com.boke.house.controller;

import com.boke.house.service.impl.ProductDetailsService;
import com.boke.house.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductDetailsService productDetailsService;

    @RequestMapping("/product/{productId}")
    public String productDetails(Model model, @PathVariable("productId") String productId) {
        int id = Integer.parseInt(productId);
        ProductVO productVO = productDetailsService.getProductVOByProductId(id);
        model.addAttribute("product", productVO);
        return "product-details";
    }

}
