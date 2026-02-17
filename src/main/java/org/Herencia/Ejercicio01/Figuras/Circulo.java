package org.Herencia.Ejercicio01.Figuras;

public class Circulo extends Figuras {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getRadio() {
        return radio;
    }

}