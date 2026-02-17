package org.Herencia.Ejercicio02.Nomina;

public class EmpleadoRepartidor extends Empleado{
    private int zona;

    public EmpleadoRepartidor(String nombre, double pagoBase, int zona) {
        super(nombre, pagoBase);
        this.zona = zona;
    }

    @Override
    public double calcularPago() {
        double bono = 0;
        if (zona == 3) {
            bono = 200;
        }
        return pagoBase + bono;
    }

    public int getZona() {
        return zona;
    }
}