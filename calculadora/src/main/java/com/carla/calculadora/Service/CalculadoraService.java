package com.carla.calculadora.Service;

import com.carla.calculadora.DTO.CalculadoraDTO;
import com.carla.calculadora.DTO.ResponseDTO;
import com.carla.calculadora.Util.CalculadoraUtil;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public ResponseDTO calcularVisualizacao(CalculadoraDTO calculadoraDTO) {

        ResponseDTO responseDTO = new ResponseDTO();
        CalculadoraUtil calculadoraUtil = new CalculadoraUtil();
        Integer visualizacaoIniciao = 0;
        Integer visualizacaoFinal = 0;


        visualizacaoIniciao = calculadoraUtil.calcularPessoasAnuncioOriginal(calculadoraDTO.getValor()).intValue();
        visualizacaoFinal = calculadoraUtil.calcularPessoasAnuncioOriginal(calculadoraDTO.getValor()).intValue();

        responseDTO.setQuantidaVisualizacao(calculadoraUtil.calcularPessoasClicam(visualizacaoFinal));

        responseDTO.setQuantidaVisualizacao(calculadoraUtil.calcularPessoasCompartilha(responseDTO.getQuantidaVisualizacao()));
        responseDTO.setQuantidaVisualizacao(calculadoraUtil.calcularPessoasVisualizacaoFinal(responseDTO.getQuantidaVisualizacao()));
        responseDTO.setQuantidaVisualizacao(responseDTO.getQuantidaVisualizacao() + visualizacaoIniciao);


        return responseDTO;
    }
}
