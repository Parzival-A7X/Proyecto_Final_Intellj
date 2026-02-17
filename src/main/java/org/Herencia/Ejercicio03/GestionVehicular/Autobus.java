package org.Herencia.Ejercicio03.GestionVehicular;

public class Autobus extends Vehiculo {
    private int capacidadPasajeros;

    public Autobus(String marca, String modelo, int capacidadPasajeros) {
        super(marca, modelo);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

}
