package org.Herencia.Ejercicio03.GestionVehicular;

public class Moto extends Vehiculo{
    private boolean tieneSidecar;

    public Moto(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

}
