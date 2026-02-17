package org.Herencia.Ejercicio01.app;

import org.Herencia.Ejercicio01.Figuras.Circulo;
import org.Herencia.Ejercicio01.Figuras.Figuras;
import org.Herencia.Ejercicio01.Figuras.Rectangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Rojo", 8.0);
        Rectangulo rectangulo = new Rectangulo("Azul", 4.0, 6.0);

        Figuras[] figuras = new Figuras[2];
        figuras[0] = circulo;
        figuras[1] = rectangulo;

        for (Figuras figura : figuras) {
            System.out.println("Figura " + figura.getColor() + " - Área: " + figura.calcularArea());
        }
    }
}