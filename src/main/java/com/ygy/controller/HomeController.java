package com.ygy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/log")
    public String index(Model model){
       model.addAttribute("msg","hahhha");
       return "home";
    }
}
