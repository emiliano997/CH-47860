package edu.coderhouse.example.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola-mundo")
public class HolaMundo {

    private int count = 0;

    @GetMapping("/saludo")
    public String saludo() {
        return "Hola Mundo!";
    }

    @GetMapping("/fecha-actual")
    public String fechaActual() {
        count++;
        return "Fecha actual: " + LocalDateTime.now() + "! Visitas: " + count;
    }
}
