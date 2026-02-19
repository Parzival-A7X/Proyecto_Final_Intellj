package org.Proyecto.ACT5_Santiago.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.Proyecto.ACT5_Santiago.pokemon.Pokemon;


public class Jugador {
    private String nombre;
    private int coins;
    private List<Pokemon> pokedex;

    public Jugador(String nombre, int coinsIniciales){
        this.nombre = nombre;
        this.coins = coinsIniciales;
        this.pokedex = new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }

    public boolean puedeTirar() {
        return coins > 10;
    }

    public void gastarCoins() {
        coins -= 10;
    }

    public void agregarPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }

    public int getCoins() {
        return coins;
    }
}
