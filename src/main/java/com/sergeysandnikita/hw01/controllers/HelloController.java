package com.sergeysandnikita.hw01.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/greeting")
    public String greeting() {
        return "HELLO WRLD!";
    }
}
