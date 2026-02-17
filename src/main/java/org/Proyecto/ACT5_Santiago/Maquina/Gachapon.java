package org.Proyecto.ACT5_Santiago.Maquina;
import org.Proyecto.ACT5_Santiago.pokemon.Pokedex;
import org.Proyecto.ACT5_Santiago.pokemon.Pokemon;

import java.util.List;
import java.util.Random;

public class Gachapon {

    private Pokedex pokedex;
    private Random random = new Random();

    public Gachapon(Pokedex pokedex){
        this.pokedex = pokedex;
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
