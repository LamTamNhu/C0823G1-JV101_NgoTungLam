package com.example.pigpen.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String toHome() {
        return "home";
    }
    public String addPen()
}
