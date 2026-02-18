package org.Proyecto.Pokestation.app;

import org.Proyecto.Pokestation.Maquina.Gachapon;
import org.Proyecto.Pokestation.Usuario.Jugador;
import org.Proyecto.Pokestation.pokemon.Pokedex;
import org.Proyecto.Pokestation.pokemon.Pokemon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        Gachapon maquina = new Gachapon(pokedex);
        Jugador jugador = new Jugador(10); // 10 monedas iniciales
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("\n--- GACHAPON ---");
                System.out.println("Monedas: " + jugador.getCoins());
                System.out.println("1. Tirar (cuesta 1 moneda)");
                System.out.println("2. Ver mis Pokémon");
                System.out.println("3. Salir");
                System.out.print("Elige: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // consumir salto de línea

                switch (opcion) {
                    case 1:
                        if (jugador.puedeTirar()) {
                            jugador.gastarCoins();
                            Pokemon obtenido = maquina.tirar();
                            jugador.agregarPokemon(obtenido);
                            System.out.println("¡Obtuviste a " + obtenido.getNombre() + "! (" + obtenido.getRareza() + ")");
                        } else {
                            System.out.println("No tienes suficientes monedas.");
                        }
                        break;
                    case 2:
                        System.out.println("Tus Pokémon:");
                        // Aquí necesitas un método para listarlos. Por ahora podrías acceder a la lista (aunque es privada).
                        // Podrías agregar un getter o un método mostrar.
                        break;
                    case 3:
                        System.out.println("¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        }
    }catch Exception InputMismatchException{
        System.out.print("dato incorrecto : ");

    }
}