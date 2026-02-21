package org.Proyecto.Pokestation.app;

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
        DialogoInicioSesion();
        actualizarPantalla();
    }

    private void DialogoInicioSesion() {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle("Inicio de sesión");
        dialog.setHeaderText("Bienvenido a Pokestation");
        dialog.setContentText("Ingresa tu nombre de usuario:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent() && !result.get().trim().isEmpty()) {
            cambiarUsuario(result.get().trim());
        } else {
            // Si cancela o ingresa vacío, creamos un usuario por defecto
            cambiarUsuario("Invitado");
            txtArea.appendText("Has iniciado como Invitado. Puedes cambiar de usuario en cualquier momento.\n");
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
    private void liberarPokemon() {
        // Por simplicidad, libera el último
        if (!usuarioActual.getPokedex().isEmpty()) {
            Pokemon liberado = usuarioActual.getPokedex().remove(usuarioActual.getPokedex().size() - 1);
            txtArea.appendText("Has liberado a " + liberado.getNombre() + "\n");
        } else {
            txtArea.appendText("No tienes Pokémon para liberar.\n");
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
    }

    @FXML
    private void salir() {
        System.exit(0);
    }
}