package org.parzival.model.Persona;

public class Cliente extends Persona{

    String numeroLicencia;

    public Cliente(String nombre, String telefono, String email){
        super (nombre, telefono, email);
        this.numeroLicencia = numeroLicencia;

    }
}

