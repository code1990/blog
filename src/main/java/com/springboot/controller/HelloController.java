package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {

//    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @Value("${person.last-name}")
    private String name;

//    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(){
        return "say"+name;
    }

    @RequestMapping
    public String index() {
        return "index";
    }
}
