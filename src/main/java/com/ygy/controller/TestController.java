package com.ygy.controller;

import com.github.pagehelper.PageHelper;
import com.ygy.model.Test;
import com.ygy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ygy
 * @since 2017/11/23
 */
@Controller
public class TestController {
    @Autowired
    private TestService service;
    @RequestMapping("/")
    public String con(@ModelAttribute(value = "Test") Test test) {
        return "index";
    }
    @RequestMapping("/a")
    public String addTest(@ModelAttribute(value = "Test")Test test){
        this.service.add(test);
        return "success";
    }
    @RequestMapping("/select")
    public String selectTest(@ModelAttribute(value = "Test")Test test, Model model){
        List<Test> list= this.service.select(test.getId());
        model.addAttribute("LogList",list);
        return "select";
    }
    @RequestMapping("/delete")
    public  String delete(@ModelAttribute(value = "Test")Test test, Model model){
          this.service.delete(test.getId());
        return "select";
    }
    @RequestMapping("/selectByName")
    public String selectByName(@ModelAttribute(value = "Test")Test test,Model model){
         List<Test> list=this.service.SelectByName(test.getName());
         model.addAttribute("LogList",list);
        return "select";
    }
}
