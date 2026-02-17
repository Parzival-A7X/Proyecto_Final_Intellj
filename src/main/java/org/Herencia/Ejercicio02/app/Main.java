package org.Herencia.Ejercicio02.app;
import org.Herencia.Ejercicio02.Nomina.Empleado;
import org.Herencia.Ejercicio02.Nomina.EmpleadoPorComision;
import org.Herencia.Ejercicio02.Nomina.EmpleadoRepartidor;


public class Main {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[5];

        Empleado empleado01 = new EmpleadoPorComision("Bruno Bucciarati", 2000.0, 8000.0, 0.4);
        Empleado empleado02 = new EmpleadoPorComision("Giorno Giovana", 1500.0, 6500.0, 0.2);
        Empleado empleado03 = new EmpleadoRepartidor("Leone Abacchio", 1800.0, 3);
        Empleado empleado04 = new EmpleadoRepartidor("Guido Mista", 2300.0, 4);
        Empleado empleado05 = new EmpleadoRepartidor("Narancia Ghirga", 800.0, 3);

        empleados[0] = empleado01;
        empleados[1] = empleado02;
        empleados[2] = empleado03;
        empleados[3] = empleado04;
        empleados[4] = empleado05;


        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.getNombre());
            System.out.println("Pago Total: " + empleado.calcularPago());
            System.out.println("---------------------------");
        }
    }

}