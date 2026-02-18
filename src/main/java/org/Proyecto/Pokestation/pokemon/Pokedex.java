package org.Proyecto.Pokestation.pokemon;
import java.util.ArrayList;
import java.util.List;

import static org.Proyecto.Pokestation.pokemon.Rareza.*;
import static org.Proyecto.Pokestation.pokemon.Tipo.*;

public class Pokedex {

    private List<Pokemon> comunes = new ArrayList<>();
    private List<Pokemon> raros = new ArrayList<>();
    private List<Pokemon> legendarios = new ArrayList<>();

    public Pokedex(){
        cargarPokemones();
    }

    private void cargarPokemones(){
        comunes.add(new Pokemon("Pikachu", COMUN, ELECTRICO));
        comunes.add(new Pokemon("Bulbasaur", COMUN, PLANTA));
        comunes.add(new Pokemon("Charmander", COMUN, FUEGO));
        comunes.add(new Pokemon("Squirtle", COMUN, AGUA));
        comunes.add(new Pokemon("Caterpie", COMUN, BICHO));

        raros.add(new Pokemon("Eevee", RARO, NORMAL));
        raros.add(new Pokemon("Vaporeon", RARO, AGUA));
        raros.add(new Pokemon("Jolteon", RARO, ELECTRICO));
        raros.add(new Pokemon("Flareon", RARO, FUEGO));
        raros.add(new Pokemon("Espeon", RARO, PSIQUICO));

        legendarios.add(new Pokemon("Mewtwo", LEGENDARIO, PSIQUICO));
        legendarios.add(new Pokemon("Lugia", LEGENDARIO, VOLADOR));
        legendarios.add(new Pokemon("Ho-Oh", LEGENDARIO, DRAGON));

    }

    public List<Pokemon> getComunes(){
        return comunes;
    }

    public List<Pokemon> getRaros(){
        return raros;
    }

    public List<Pokemon> getLegendarios(){
        return legendarios;
    }

}
