package com.seungwook.springbootinit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    String getHello(){
        return "Hello World";
    }
}
