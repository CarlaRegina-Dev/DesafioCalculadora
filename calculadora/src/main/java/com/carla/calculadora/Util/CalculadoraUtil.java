package com.carla.calculadora.Util;


public class CalculadoraUtil {

    public Integer calcularPessoasAnuncioOriginal(Double valor) {
        valor = valor * 30;
        return valor.intValue();
    }

    public Integer calcularPessoasClicam(Integer valor) {
        Integer valorPessoa = valor / 100;
        return valorPessoa * 12;
    }

    public Integer calcularPessoasCompartilha(Integer valor) {
        Integer valorPessoa = valor / 20;
        return valorPessoa * 3;
    }

    public Integer calcularPessoasVisualizacaoFinal(Integer valor) {
        Integer valorPessoa = valor * 40;
        return valorPessoa;
    }

}
