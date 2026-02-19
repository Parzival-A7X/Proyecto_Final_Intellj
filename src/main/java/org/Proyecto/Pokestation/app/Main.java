package org.Proyecto.Pokestation.app;

import org.Proyecto.Pokestation.Maquina.Gachapon;
import org.Proyecto.Pokestation.Usuario.Jugador;
import org.Proyecto.Pokestation.pokemon.Pokedex;
import org.Proyecto.Pokestation.pokemon.Pokemon;
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    private static void cambiarUsuario(Scanner scanner){
        System.out.println("\n***** Cambiar / Creación de usuario *****");
    if(!usuarios.isEmpty()){
        System.out.println("Usuarios existentes: ");
        for (String usuariosexistentes : usuarios.keySet()){
            System.out.println("- "+usuariosexistentes);
        }
    }
        System.out.println("Ingresar usuario nuevo o existente ");
    String nombre = scanner.nextLine();
    if (usuarios.containsKey(nombre)){
        usuarioActual = usuarios.get(nombre);
        System.out.println("Bienvenido de vuelta: "+ nombre);
    }else {
        usuarioActual = new Jugador(nombre, 10);
        usuarios.put(nombre, usuarioActual);
        System.out.println("Usuario creado, \n Hola: "+ nombre);

    }
    }
    private static HashMap<String, Jugador> usuarios = new HashMap<>();
    private static Jugador usuarioActual;
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        Gachapon maquina = new Gachapon(pokedex);
<<<<<<< Updated upstream:src/main/java/org/Proyecto/ACT5_Santiago/app/Main.java
        Scanner scanner = new Scanner(System.in);
    cambiarUsuario(scanner);
        while (true) {

            try {
                System.out.println("Usuario actual: ".toUpperCase()+ usuarioActual.getNombre());
                System.out.println("---------------------------------");
                System.out.println("Monedas: " + usuarioActual.getCoins());
                System.out.println("---------------------------------");
=======
        Jugador jugador = new Jugador(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Monedas: " + jugador.getCoins());
>>>>>>> Stashed changes:src/main/java/org/Proyecto/Pokestation/app/Main.java
                System.out.println("1. Tirar (cuesta 1 moneda)");
                System.out.println("---------------------------------");
                System.out.println("2. Ver mis Pokémon");
                System.out.println("---------------------------------");
                System.out.println("3. Intercambiar Pokémon");
                System.out.println("---------------------------------");
                System.out.println("4. Cambiar de usuario");
                System.out.println("---------------------------------");
                System.out.println("5. Salir");
                System.out.print("Elige: ");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        if (usuarioActual.puedeTirar()) {
                            usuarioActual.gastarCoins();
                            Pokemon obtenido = maquina.tirar();
<<<<<<< Updated upstream:src/main/java/org/Proyecto/ACT5_Santiago/app/Main.java
                            usuarioActual.agregarPokemon(obtenido);
=======
                            jugador.agregarPokemon(obtenido);
>>>>>>> Stashed changes:src/main/java/org/Proyecto/Pokestation/app/Main.java
                            System.out.println("¡Obtuviste a "
                                    + obtenido.getNombre()
                                    + "! (" + obtenido.getRareza() + ")");
                        } else {
                            System.out.println("No tienes suficientes monedas.");
                        }
                        break;

                    case 2:
<<<<<<< Updated upstream:src/main/java/org/Proyecto/ACT5_Santiago/app/Main.java
=======
                        System.out.println("Tus Pokémon:");
>>>>>>> Stashed changes:src/main/java/org/Proyecto/Pokestation/app/Main.java
                        break;

                    case 3:
                        System.out.println("En proceso...");
                        break;
                    case 4:
                        cambiarUsuario(scanner);
                        break;
                    case 5:
                        System.out.println("Hasta luego!");
                        return;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (Exception e) {
                System.out.println("Dato incorrecto, ingrese un número válido.");
<<<<<<< Updated upstream:src/main/java/org/Proyecto/ACT5_Santiago/app/Main.java
                scanner.nextLine();
=======
                scanner.nextLine(); // limpiar buffer
>>>>>>> Stashed changes:src/main/java/org/Proyecto/Pokestation/app/Main.java
            }
        }
    }
}
