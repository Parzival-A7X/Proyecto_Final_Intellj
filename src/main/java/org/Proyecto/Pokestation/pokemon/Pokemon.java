package org.Proyecto.Pokestation.pokemon;

public class Pokemon {
    private String nombre;
    private Rareza rareza;
    private Tipo tipo;

    public Pokemon(String nombre, Rareza rareza, Tipo tipo) {
        this.nombre = nombre;
        this.rareza = rareza;
        this.tipo =tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public Enum<Rareza> getRareza() {
        return rareza;
    }

    public Enum<Tipo> getTipo() {
        return tipo;
    }

}
