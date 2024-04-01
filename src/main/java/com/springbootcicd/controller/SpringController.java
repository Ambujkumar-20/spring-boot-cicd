package com.springbootcicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
    @GetMapping("/sorry")
    public String getMessage()
    {
        return "sorry God!";
    }
}
