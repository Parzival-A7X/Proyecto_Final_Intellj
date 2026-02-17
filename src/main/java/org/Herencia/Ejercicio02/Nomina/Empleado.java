package org.Herencia.Ejercicio02.Nomina;

public class Empleado {
    private String nombre;
    public double pagoBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.pagoBase = salarioBase;
    }

    public double calcularPago() {
        return pagoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPagoBase() {
        return pagoBase;
    }

}