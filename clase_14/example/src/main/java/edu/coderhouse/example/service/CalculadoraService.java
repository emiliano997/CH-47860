package edu.coderhouse.example.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    

    public Integer suma(Integer a, Integer b) {
        return a + b;
    }

    public Integer resta(Integer a, Integer b) {
        return a - b;
    }

    public Integer multiplicacion(Integer a, Integer b) {
        return a * b;
    }

    public Integer division(Integer a, Integer b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        return a / b;
    }
}
