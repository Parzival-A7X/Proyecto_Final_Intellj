package org.Proyecto.Pokestation.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.Proyecto.Pokestation.pokemon.Pokemon;


public class Jugador {

    private int coins;
    private List<Pokemon> pokedex;

    public Jugador(int coindIniciales){
        this.coins = coindIniciales;
        this.pokedex = new ArrayList<>();
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
