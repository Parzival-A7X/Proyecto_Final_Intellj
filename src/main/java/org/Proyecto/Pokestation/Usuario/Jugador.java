package org.Proyecto.Pokestation.Usuario;

import java.util.ArrayList;
import java.util.List;

import org.Proyecto.Pokestation.pokemon.Pokemon;

import static org.Proyecto.Pokestation.pokemon.Rareza.*;


public class Jugador {
    private String nombre;
    private int coins;
    private List<Pokemon> pokedex;

    public Jugador(String nombre, int coindIniciales) {
        this.nombre = nombre;
        this.coins = coindIniciales;
        this.pokedex = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean puedeTirar() {
        return coins >= 3;
    }

    public void gastarCoins() {
        coins -= 3;
    }


    public void agregarPokemon(Pokemon pokemon) {
        pokedex.add(pokemon);
    }

    public int getCoins() {
        return coins;
    }

    public void monedasporRareza(Pokemon pokemon) {
        switch (pokemon.getRareza()) {
            case COMUN -> coins += 1;
            case RARO -> coins += 3;
            case LEGENDARIO -> coins += 5;
            default -> coins += 0;
        }
    }

    public List<Pokemon> getPokedex() {
        return pokedex;
    }

    public void mostrarPokemon() {
        if (pokedex.isEmpty()) {
            System.out.println("No tienes pokemones ");
        } else {
            System.out.println("Tus pokemones capturados: ");
            int i = 1;
            for (Pokemon p : pokedex) {
                System.out.println(i + ". " + p.getNombre() + " | " + p.getTipo() + " | (" + p.getRareza() + ")");
                i++;
            }
        }
    }
}