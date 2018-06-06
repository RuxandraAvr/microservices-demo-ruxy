package com.example.democonfigserverm2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Hello from the other side!";
    }
}
