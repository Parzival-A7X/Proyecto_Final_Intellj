package org.Herencia.Ejercicio02.Nomina;

public class EmpleadoPorComision extends Empleado {
    private double ventasRealizadas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, double pagoBase, double ventasRealizadas, double tarifaComision) {
        super(nombre, pagoBase);
        this.ventasRealizadas = ventasRealizadas;
        this.tarifaComision = tarifaComision;
    }

    public double calcularPago() {
        return getPagoBase() + (ventasRealizadas * tarifaComision);
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }


}
