package edu.coderhouse.example.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.coderhouse.example.service.CalculadoraService;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
    
    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping(value = "/suma")
    public Integer suma(@RequestParam(name = "numero1") Integer a, @RequestParam(name = "b") Integer b) {
        return calculadoraService.suma(a, b);
    }

    @GetMapping(value = "/resta")
    public Integer resta(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b) {
        return calculadoraService.resta(a, b);
    }

    @GetMapping(value = "/multiplicacion")
    public Integer multiplicacion(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b) {
        return calculadoraService.multiplicacion(a, b);
        
    }

    @GetMapping(value = "/division")
    public Integer division(@RequestParam(name = "a") Integer a, @RequestParam(name = "b") Integer b) {
        return calculadoraService.division(a, b);
    }
}
