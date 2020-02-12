package com.aop.example.aspect.controller;

import com.aop.example.aspect.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping( "/hello/{message}" )
    public String getMessage(@PathVariable String message) {
       // throw new RuntimeException(" for text  "+ message);
        return helloService.getMessage(message);
    }
}
