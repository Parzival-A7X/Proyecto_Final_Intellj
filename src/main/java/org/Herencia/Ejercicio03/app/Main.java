package org.Herencia.Ejercicio03.app;
import org.Herencia.Ejercicio03.GestionVehicular.Vehiculo;
import org.Herencia.Ejercicio03.GestionVehicular.Autobus;
import org.Herencia.Ejercicio03.GestionVehicular.Moto;


public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[2];

        vehiculos[0] = new Autobus("Mercedes-Benz", "MBO 1421/60 (Boxer)", 32);
        vehiculos[1] = new Moto("Honda", "Hornet 2.0 ", false);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDetalles();
            System.out.println("---------------------------");
        }
    }

}
