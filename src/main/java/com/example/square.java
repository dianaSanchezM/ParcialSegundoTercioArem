/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author 2108310
 */
public class square {
    private int valor;
    private int cuadrado;

    public square(int valor) {
        this.valor = valor;
        cuadrado=(int) Math.pow(valor, 2);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(int cuadrado) {
        this.cuadrado = cuadrado;
    }
}
