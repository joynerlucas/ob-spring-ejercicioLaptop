package com.example.obspringejercicioLaptop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String holaMundo()
    {
        return "hola a todos !!";
    }

}
