package com.example.pigpen.controller;

import com.example.pigpen.model.Pen;
import com.example.pigpen.service.IPenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    IPenService penService;

    @ModelAttribute("pen")
    public Pen defaultPen() {
        return new Pen();
    }

    @GetMapping("/")
    public String toHome(@PageableDefault(size = 3) Pageable pageable,
                         Model model) {
        Page<Pen> pens = penService.getAll(pageable);
        model.addAttribute("pens",pens);
        return "home";
    }

    @PostMapping("/pen/add")
    public String addPen(@ModelAttribute Pen newPen,
                         Model model) {
        penService.save(newPen);
        model.addAttribute("message", "Pen added!");
        return "home";
    }
}
