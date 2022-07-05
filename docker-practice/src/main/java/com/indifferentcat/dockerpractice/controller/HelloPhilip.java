package com.indifferentcat.dockerpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloPhilip {

    @GetMapping
    public String helloPhilip() {
        return "Hello, my name is Philip!";
    }
}
