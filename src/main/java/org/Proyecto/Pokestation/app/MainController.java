package org.Proyecto.Pokestation.app;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import org.Proyecto.Pokestation.Maquina.Gachapon;
import org.Proyecto.Pokestation.Usuario.Jugador;
import org.Proyecto.Pokestation.pokemon.Pokedex;
import org.Proyecto.Pokestation.pokemon.Pokemon;

import java.util.HashMap;
import java.util.Optional;

public class MainController {

    @FXML
    private Label lblUsuario;
    @FXML
    private Label lblMonedas;
    @FXML
    private TextArea txtArea;

    private Pokedex pokedex = new Pokedex();
    private Gachapon maquina = new Gachapon(pokedex);
    private HashMap<String, Jugador> usuarios = new HashMap<>();
    private Jugador usuarioActual;

    @FXML
    public void initialize() {
        // Mostrar diálogo de inicio de sesión al arrancar
        mostrarDialogoInicioSesion();
        actualizarPantalla();
    }

    private void mostrarDialogoInicioSesion() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Inicio de sesión");
        dialog.setHeaderText("Bienvenido a Pokestation Gachapon");
        dialog.setContentText("Ingresa tu nombre de usuario:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent() && !result.get().trim().isEmpty()) {
            cambiarUsuario(result.get().trim());
        } else {
            Platform.exit();
        }
    }

    private void cambiarUsuario(String nombre) {
        if (usuarios.containsKey(nombre)) {
            usuarioActual = usuarios.get(nombre);
            txtArea.appendText("Bienvenido de nuevo, " + nombre + "\n");
        } else {
            usuarioActual = new Jugador(nombre, 10);
            usuarios.put(nombre, usuarioActual);
            txtArea.appendText("Usuario creado. ¡Hola, " + nombre + "!\n");
        }
        actualizarLabels();
    }

    private void actualizarLabels() {
        lblUsuario.setText("Usuario: " + usuarioActual.getNombre());
        lblMonedas.setText("Monedas: " + usuarioActual.getCoins());
    }

    private void actualizarPantalla() {
        actualizarLabels();
    }

    @FXML
    private void tirar() {
        if (usuarioActual.puedeTirar()) {
            usuarioActual.gastarCoins();
            Pokemon obtenido = maquina.tirar();
            usuarioActual.agregarPokemon(obtenido);
            usuarioActual.monedasporRareza(obtenido);
            txtArea.appendText("¡Obtuviste a " + obtenido.getNombre() + "! (" + obtenido.getRareza() + ")\n");
            actualizarLabels();
        } else {
            txtArea.appendText("No tienes suficientes monedas.\n");
        }
    }

    @FXML
    private void verPokemon() {
        if (usuarioActual.getPokedex().isEmpty()) {
            txtArea.appendText("No tienes Pokémon.\n");
        } else {
            txtArea.appendText("Tus Pokémon:\n");
            int i = 1;
            for (Pokemon p : usuarioActual.getPokedex()) {
                txtArea.appendText(i + ". " + p.getNombre() + " | " + p.getTipo() + " | (" + p.getRareza() + ")\n");
                i++;
            }
        }
    }

    @FXML
    private void cambiarUsuario() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Cambiar usuario");
        dialog.setHeaderText("Cambiar de usuario");
        dialog.setContentText("Ingresa el nombre del usuario:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent() && !result.get().trim().isEmpty()) {
            cambiarUsuario(result.get().trim());
        }
        // Si cancela, no hacemos nada
    }

    @FXML
    private void salir() {
        Platform.exit();
    }
}