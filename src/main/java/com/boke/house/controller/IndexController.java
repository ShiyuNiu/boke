package com.boke.house.controller;

import com.boke.house.service.impl.ProductDetailsService;
import com.boke.house.vo.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController extends BaseController {
    @Autowired
    private ProductDetailsService productDetailsService;
    @RequestMapping({"/", "/home", "/index"})
    public String index(Model model) {
        List<ProductVO> products = productDetailsService.listAllProducts();
        model.addAttribute("products", products);
        return "index";
    }
}
