package com.carla.calculadora.Controller;

import com.carla.calculadora.DTO.CalculadoraDTO;
import com.carla.calculadora.DTO.ResponseDTO;
import com.carla.calculadora.Service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class ClaculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping
    public ResponseDTO cadastrarAnuncio(@ModelAttribute CalculadoraDTO calculadoraDTO) {

        return calculadoraService.calcularVisualizacao(calculadoraDTO);
    }
}
