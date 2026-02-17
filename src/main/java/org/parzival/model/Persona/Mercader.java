package org.parzival.model.Persona;

public class Mercader extends Persona{
    String numeroEmpleado;

    public Mercader(String nombre, String numero, String email, String numeroEmpleado) {
        super(nombre, numero, email);
        this.numeroEmpleado = numeroEmpleado;
    }
}

