package com.boke.house.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController {
    @RequestMapping({"/", "/home", "/index"})
    public String index() {
        return "index";
    }
}
