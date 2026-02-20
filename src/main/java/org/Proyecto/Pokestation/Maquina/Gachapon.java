package org.Proyecto.Pokestation.Maquina;
import org.Proyecto.Pokestation.pokemon.Pokedex;
import org.Proyecto.Pokestation.pokemon.Pokemon;

import java.util.List;
import java.util.Random;

public class Gachapon {

    private Pokedex pokedex;
    private Random random;

    public Gachapon(Pokedex pokedex){
        this.pokedex = pokedex;
        this.random = new Random();
    }

    public Pokemon tirar () {
        int suerte = random.nextInt(100);

        if (suerte < 60) {
        return pokemonAleatorio(pokedex.getComunes());
        }else if (suerte < 90) {
            return pokemonAleatorio(pokedex.getRaros());
        }else {
            return pokemonAleatorio(pokedex.getLegendarios());
        }
    }
    private Pokemon pokemonAleatorio(List<Pokemon> lista){
        return lista.get(random.nextInt(lista.size()));
    }
}
