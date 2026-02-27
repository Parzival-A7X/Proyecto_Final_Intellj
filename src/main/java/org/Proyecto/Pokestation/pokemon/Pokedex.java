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
        // Comunes
        comunes.add(new Pokemon("Bulbasaur", COMUN, PLANTA));
        comunes.add(new Pokemon("Ivysaur", COMUN, PLANTA));
        comunes.add(new Pokemon("Venusaur", COMUN, PLANTA));
        comunes.add(new Pokemon("Charmander", COMUN, FUEGO));
        comunes.add(new Pokemon("Charmeleon", COMUN, FUEGO));
        comunes.add(new Pokemon("Charizard", COMUN, FUEGO));
        comunes.add(new Pokemon("Squirtle", COMUN, AGUA));
        comunes.add(new Pokemon("Wartortle", COMUN, AGUA));
        comunes.add(new Pokemon("Blastoise", COMUN, AGUA));
        comunes.add(new Pokemon("Caterpie", COMUN, BICHO));
        comunes.add(new Pokemon("Metapod", COMUN, BICHO));
        comunes.add(new Pokemon("Butterfree", COMUN, BICHO));
        comunes.add(new Pokemon("Weedle", COMUN, BICHO));
        comunes.add(new Pokemon("Kakuna", COMUN, BICHO));
        comunes.add(new Pokemon("Beedrill", COMUN, BICHO));
        comunes.add(new Pokemon("Pidgey", COMUN, NORMAL));
        comunes.add(new Pokemon("Pidgeotto", COMUN, NORMAL));
        comunes.add(new Pokemon("Pidgeot", COMUN, NORMAL));
        comunes.add(new Pokemon("Rattata", COMUN, NORMAL));
        comunes.add(new Pokemon("Raticate", COMUN, NORMAL));
        comunes.add(new Pokemon("Spearow", COMUN, NORMAL));
        comunes.add(new Pokemon("Fearow", COMUN, NORMAL));
        comunes.add(new Pokemon("Ekans", COMUN, VENENO));
        comunes.add(new Pokemon("Arbok", COMUN, VENENO));
        comunes.add(new Pokemon("Pikachu", COMUN, ELECTRICO));
        comunes.add(new Pokemon("Raichu", COMUN, ELECTRICO));
        comunes.add(new Pokemon("Sandshrew", COMUN, TIERRA));
        comunes.add(new Pokemon("Sandslash", COMUN, TIERRA));
        comunes.add(new Pokemon("Nidoran♀", COMUN, VENENO));
        comunes.add(new Pokemon("Nidorina", COMUN, VENENO));
        comunes.add(new Pokemon("Nidoqueen", COMUN, VENENO));
        comunes.add(new Pokemon("Nidoran♂", COMUN, VENENO));
        comunes.add(new Pokemon("Nidorino", COMUN, VENENO));
        comunes.add(new Pokemon("Nidoking", COMUN, VENENO));
        comunes.add(new Pokemon("Vulpix", COMUN, FUEGO));
        comunes.add(new Pokemon("Ninetales", COMUN, FUEGO));
        comunes.add(new Pokemon("Jigglypuff", COMUN, NORMAL));
        comunes.add(new Pokemon("Wigglytuff", COMUN, NORMAL));
        comunes.add(new Pokemon("Zubat", COMUN, VENENO));
        comunes.add(new Pokemon("Golbat", COMUN, VENENO));
        comunes.add(new Pokemon("Oddish", COMUN, PLANTA));
        comunes.add(new Pokemon("Gloom", COMUN, PLANTA));
        comunes.add(new Pokemon("Vileplume", COMUN, PLANTA));
        comunes.add(new Pokemon("Paras", COMUN, BICHO));
        comunes.add(new Pokemon("Parasect", COMUN, BICHO));
        comunes.add(new Pokemon("Venonat", COMUN, BICHO));
        comunes.add(new Pokemon("Venomoth", COMUN, BICHO));
        comunes.add(new Pokemon("Diglett", COMUN, TIERRA));
        comunes.add(new Pokemon("Dugtrio", COMUN, TIERRA));
        comunes.add(new Pokemon("Meowth", COMUN, NORMAL));
        comunes.add(new Pokemon("Persian", COMUN, NORMAL));
        comunes.add(new Pokemon("Psyduck", COMUN, AGUA));
        comunes.add(new Pokemon("Golduck", COMUN, AGUA));
        comunes.add(new Pokemon("Mankey", COMUN, LUCHA));
        comunes.add(new Pokemon("Primeape", COMUN, LUCHA));
        comunes.add(new Pokemon("Growlithe", COMUN, FUEGO));
        comunes.add(new Pokemon("Arcanine", COMUN, FUEGO));
        comunes.add(new Pokemon("Poliwag", COMUN, AGUA));
        comunes.add(new Pokemon("Poliwhirl", COMUN, AGUA));
        comunes.add(new Pokemon("Poliwrath", COMUN, AGUA));
        comunes.add(new Pokemon("Abra", COMUN, PSIQUICO));
        comunes.add(new Pokemon("Kadabra", COMUN, PSIQUICO));
        comunes.add(new Pokemon("Alakazam", COMUN, PSIQUICO));
        comunes.add(new Pokemon("Machop", COMUN, LUCHA));
        comunes.add(new Pokemon("Machoke", COMUN, LUCHA));
        comunes.add(new Pokemon("Machamp", COMUN, LUCHA));
        comunes.add(new Pokemon("Bellsprout", COMUN, PLANTA));
        comunes.add(new Pokemon("Weepinbell", COMUN, PLANTA));
        comunes.add(new Pokemon("Victreebel", COMUN, PLANTA));
        comunes.add(new Pokemon("Tentacool", COMUN, AGUA));
        comunes.add(new Pokemon("Tentacruel", COMUN, AGUA));
        comunes.add(new Pokemon("Geodude", COMUN, ROCA));
        comunes.add(new Pokemon("Graveler", COMUN, ROCA));
        comunes.add(new Pokemon("Golem", COMUN, ROCA));
        comunes.add(new Pokemon("Ponyta", COMUN, FUEGO));
        comunes.add(new Pokemon("Rapidash", COMUN, FUEGO));
        comunes.add(new Pokemon("Slowpoke", COMUN, AGUA));
        comunes.add(new Pokemon("Slowbro", COMUN, AGUA));
        comunes.add(new Pokemon("Magnemite", COMUN, ELECTRICO));
        comunes.add(new Pokemon("Magneton", COMUN, ELECTRICO));
        comunes.add(new Pokemon("Farfetch'd", COMUN, NORMAL));
        comunes.add(new Pokemon("Doduo", COMUN, NORMAL));
        comunes.add(new Pokemon("Dodrio", COMUN, NORMAL));
        comunes.add(new Pokemon("Seel", COMUN, AGUA));
        comunes.add(new Pokemon("Dewgong", COMUN, AGUA));
        comunes.add(new Pokemon("Grimer", COMUN, VENENO));
        comunes.add(new Pokemon("Muk", COMUN, VENENO));
        comunes.add(new Pokemon("Shellder", COMUN, AGUA));
        comunes.add(new Pokemon("Cloyster", COMUN, AGUA));
        comunes.add(new Pokemon("Gastly", COMUN, FANTASMA));
        comunes.add(new Pokemon("Haunter", COMUN, FANTASMA));
        comunes.add(new Pokemon("Gengar", COMUN, FANTASMA));
        comunes.add(new Pokemon("Onix", COMUN, ROCA));
        comunes.add(new Pokemon("Drowzee", COMUN, PSIQUICO));
        comunes.add(new Pokemon("Hypno", COMUN, PSIQUICO));
        comunes.add(new Pokemon("Krabby", COMUN, AGUA));
        comunes.add(new Pokemon("Kingler", COMUN, AGUA));
        comunes.add(new Pokemon("Voltorb", COMUN, ELECTRICO));
        comunes.add(new Pokemon("Electrode", COMUN, ELECTRICO));
        comunes.add(new Pokemon("Exeggcute", COMUN, PLANTA));
        comunes.add(new Pokemon("Exeggutor", COMUN, PLANTA));
        comunes.add(new Pokemon("Cubone", COMUN, TIERRA));
        comunes.add(new Pokemon("Marowak", COMUN, TIERRA));
        comunes.add(new Pokemon("Hitmonlee", COMUN, LUCHA));
        comunes.add(new Pokemon("Hitmonchan", COMUN, LUCHA));
        comunes.add(new Pokemon("Lickitung", COMUN, NORMAL));
        comunes.add(new Pokemon("Koffing", COMUN, VENENO));
        comunes.add(new Pokemon("Weezing", COMUN, VENENO));
        comunes.add(new Pokemon("Rhyhorn", COMUN, TIERRA));
        comunes.add(new Pokemon("Rhydon", COMUN, TIERRA));
        comunes.add(new Pokemon("Chansey", COMUN, NORMAL));
        comunes.add(new Pokemon("Tangela", COMUN, PLANTA));
        comunes.add(new Pokemon("Kangaskhan", COMUN, NORMAL));
        comunes.add(new Pokemon("Horsea", COMUN, AGUA));
        comunes.add(new Pokemon("Seadra", COMUN, AGUA));
        comunes.add(new Pokemon("Goldeen", COMUN, AGUA));
        comunes.add(new Pokemon("Seaking", COMUN, AGUA));
        comunes.add(new Pokemon("Staryu", COMUN, AGUA));
        comunes.add(new Pokemon("Starmie", COMUN, AGUA));
        comunes.add(new Pokemon("Mr. Mime", COMUN, PSIQUICO));
        comunes.add(new Pokemon("Scyther", COMUN, BICHO));
        comunes.add(new Pokemon("Jynx", COMUN, HIELO));
        comunes.add(new Pokemon("Electabuzz", COMUN, ELECTRICO));
        comunes.add(new Pokemon("Magmar", COMUN, FUEGO));
        comunes.add(new Pokemon("Pinsir", COMUN, BICHO));
        comunes.add(new Pokemon("Tauros", COMUN, NORMAL));
        comunes.add(new Pokemon("Magikarp", COMUN, AGUA));
        comunes.add(new Pokemon("Gyarados", COMUN, AGUA));
        comunes.add(new Pokemon("Lapras", COMUN, AGUA));
        comunes.add(new Pokemon("Ditto", COMUN, NORMAL));
        comunes.add(new Pokemon("Eevee", COMUN, NORMAL));
        comunes.add(new Pokemon("Vaporeon", COMUN, AGUA));
        comunes.add(new Pokemon("Jolteon", COMUN, ELECTRICO));
        comunes.add(new Pokemon("Flareon", COMUN, FUEGO));
        comunes.add(new Pokemon("Porygon", COMUN, NORMAL));
        comunes.add(new Pokemon("Omanyte", COMUN, ROCA));
        comunes.add(new Pokemon("Omastar", COMUN, ROCA));
        comunes.add(new Pokemon("Kabuto", COMUN, ROCA));
        comunes.add(new Pokemon("Kabutops", COMUN, ROCA));
        comunes.add(new Pokemon("Aerodactyl", COMUN, ROCA));
        comunes.add(new Pokemon("Snorlax", COMUN, NORMAL));

        // Raros (algunos de la lista anterior pueden considerarse raros, pero aquí pongo los legendarios menores o evoluciones finales fuertes)
        raros.add(new Pokemon("Dratini", RARO, DRAGON));
        raros.add(new Pokemon("Dragonair", RARO, DRAGON));
        raros.add(new Pokemon("Dragonite", RARO, DRAGON));

        // Legendarios
        legendarios.add(new Pokemon("Articuno", LEGENDARIO, HIELO));
        legendarios.add(new Pokemon("Zapdos", LEGENDARIO, ELECTRICO));
        legendarios.add(new Pokemon("Moltres", LEGENDARIO, FUEGO));
        legendarios.add(new Pokemon("Mewtwo", LEGENDARIO, PSIQUICO));
        legendarios.add(new Pokemon("Mew", LEGENDARIO, PSIQUICO));

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