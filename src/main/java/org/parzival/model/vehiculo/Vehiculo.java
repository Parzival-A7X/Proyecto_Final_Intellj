package org.parzival.model.vehiculo;

public abstract class Vehiculo {
    String placas;
    String marca;
    String modelo;
    int year;
    double precioBaseDia;
    boolean disponible;

    public Vehiculo(String placas, String marca, String modelo, int year, double precioBaseDia, boolean disponible) {
        this.placas = placas;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precioBaseDia = precioBaseDia;
        this.disponible = disponible;

    }

    public abstract double calcularPrecioRenta(int dias);
    public boolean isDisponible() {return disponible;}
    public void rentar () {disponible = false;}
    public void devolver () {disponible = true;}
    public String getPlacas() {return placas;}

}
