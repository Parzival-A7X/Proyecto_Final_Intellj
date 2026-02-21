package org.Proyecto.Pokestation.app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import org.Proyecto.Pokestation.Maquina.Gachapon;
import org.Proyecto.Pokestation.Usuario.Jugador;
import org.Proyecto.Pokestation.pokemon.Pokedex;
import org.Proyecto.Pokestation.pokemon.Pokemon;

import java.util.HashMap;

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
        // Al iniciar, creamos o cargamos un usuario por defecto (podrías pedir nombre)
        cambiarUsuario("Ash"); // Ejemplo
        actualizarPantalla();
    }
    

    private void cambiarUsuario(String nombre) {
        if (usuarios.containsKey(nombre)) {
            usuarioActual = usuarios.get(nombre);
        } else {
            usuarioActual = new Jugador(nombre, 10);
            usuarios.put(nombre, usuarioActual);
        }
        actualizarLabels();
    }

    private void actualizarLabels() {
        lblUsuario.setText("Usuario: " + usuarioActual.getNombre());
        lblMonedas.setText("Monedas: " + usuarioActual.getCoins());
    }

    private void actualizarPantalla() {
        actualizarLabels();
        // Puedes limpiar el área de texto si quieres
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
        if (usuarioActual.getPokedex().isEmpty()) {  // Necesitas un getter en Jugador
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
        // Aquí podrías mostrar una lista y pedir índice, o abrir un diálogo.
        // Por simplicidad, asumimos que liberas el último (o puedes implementar un selector)
        if (!usuarioActual.getPokedex().isEmpty()) {
            Pokemon liberado = usuarioActual.getPokedex().remove(usuarioActual.getPokedex().size() - 1);
            txtArea.appendText("Has liberado a " + liberado.getNombre() + "\n");
        } else {
            txtArea.appendText("No tienes Pokémon para liberar.\n");
        }
    }

    @FXML
    private void cambiarUsuario() {
        // Aquí podrías abrir un cuadro de diálogo para ingresar nombre.
        // Por ahora, simulamos un cambio a "Misty"
        cambiarUsuario("Misty");
        txtArea.appendText("Usuario cambiado a " + usuarioActual.getNombre() + "\n");
    }

    @FXML
    private void salir() {
        System.exit(0);
    }
}