package com.sergeysandnikita.hw01.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${greet}")
    private String greet;

    @GetMapping("/greeting")
    public String greeting() {
        return greet;
    }
}
