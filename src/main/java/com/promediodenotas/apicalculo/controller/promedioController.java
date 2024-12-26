package com.promediodenotas.apicalculo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class promedioController {

    @GetMapping("/promedio")
    public double calcularPromedio(@RequestParam double nota1,
                                   @RequestParam double nota2,
                                   @RequestParam double nota3) {
        double result = (nota1 + nota2 + nota3) / 3;

        return result;
    }
}
