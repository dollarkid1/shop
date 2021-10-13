package com.ecommerce.shop.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }


    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }

    @GetMapping("/services")
    public String getServices(){
        return "services";
    }

    @GetMapping("/products")
    public String getProduct(){
        return "product";
    }

    @GetMapping("/single")
    public String getSingle(){
        return "single";
    }

    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
}
