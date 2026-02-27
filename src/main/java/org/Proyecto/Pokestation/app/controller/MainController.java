package org.Proyecto.Pokestation.app.controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextInputDialog;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.Proyecto.Pokestation.Maquina.Gachapon;
import org.Proyecto.Pokestation.Usuario.Jugador;
import org.Proyecto.Pokestation.pokemon.Pokedex;
import org.Proyecto.Pokestation.pokemon.Pokemon;

public class MainController {

    @FXML
    private Button btnPokemon;
    @FXML
    private Button btnPokedex;
    @FXML
    private Button btnShop;
    @FXML
    private Button btnUser;
    @FXML
    private Button btnTrade;
    @FXML
    private Button btnExit;

    private Pokedex pokedex = new Pokedex();
    private Gachapon gachapon = new Gachapon(pokedex);
    private Map <String,Jugador> jugadores = new HashMap<>();
    private Jugador jugador;

    @FXML
    private void onPokemon() {

        if (!jugador.puedeTirar()) {
            mostrarAlerta("No tienes suficientes monedas (necesitas 3).");
            actualizarMonedas();
            return;
        }

        jugador.gastarCoins();

        Pokemon obtenido = gachapon.tirar();
        jugador.agregarPokemon(obtenido);
        jugador.monedasporRareza(obtenido);

        mostrarAlerta("¡Te salió!\n\n"
                + obtenido.getNombre()
                + "\nTipo: " + obtenido.getTipo()
                + "\nRareza: " + obtenido.getRareza()
                + "\n\nMonedas actuales: " + jugador.getCoins());
        actualizarMonedas();
    }

    @FXML
    private void onPokedex() {
        if (jugador.getPokedex().isEmpty()){
            mostrarAlerta("No tienes ningun pokemon capturado.");
            return;
        }
        ListView<Pokemon> lista = new ListView<>();
        lista.getItems().addAll(jugador.getPokedex());
        lista.setPrefHeight(400);
        lista.setPrefWidth(350);
        Stage ventana = new Stage();
        ventana.setTitle("### POKEDEX ###");
        Scene escena = new Scene(new VBox(lista), 400, 450);
        ventana.setScene(escena);
        ventana.show();
    }

    @FXML
    private void onShop() {

        if (jugador.getPokedex().isEmpty()) {
            mostrarAlerta("No tienes Pokémon para liberar.");
            return;

        }

        ChoiceDialog<Pokemon> dialog = new ChoiceDialog<>(
                jugador.getPokedex().get(0),
                jugador.getPokedex()
        );

        dialog.setTitle("Liberar Pokémon");
        dialog.setHeaderText("Selecciona un Pokémon para liberar \n MONEDAS ACTUALES "+ jugador.getCoins());
        dialog.setContentText("Pokémon:");

        dialog.showAndWait().ifPresent(pokemon -> {
            boolean liberado = jugador.liberarPokemon(pokemon);

            if (liberado) {
                mostrarAlerta("Has liberado a " + pokemon.getNombre()
                        + "\nRareza: " + pokemon.getRareza()
                        + "\nMonedas actuales: " + jugador.getCoins());
            }
        }
        );
        actualizarMonedas();
    }

    @FXML
    private void onUser() {
    TextInputDialog dialog = new TextInputDialog(jugador.getNombre());
    dialog.setTitle("Cambiar de usuario");
    dialog.setHeaderText("Escriba el nombre de usuario");
    dialog.setContentText("Usuario: ");

    Optional<String> resultado = dialog.showAndWait();
    if (resultado.isEmpty() || resultado.get().trim().isEmpty()) return;

    String nombre = resultado.get().trim();

    Jugador existente = jugadores.get(nombre);
    if (existente != null){
        jugador = existente;
        mostrarAlerta("Usuario actualizado:"+ nombre + "\n Monedas: "+ jugador.getCoins()+ "\n Cantidad de pokemones: "+jugador.getPokedex().size());

    }else {
        jugador = new Jugador(nombre, 10);
        jugadores.put(nombre,jugador);
        mostrarAlerta("Nuevo usuario agregado: "+ nombre + "\n Monedas iniciales: 10");

    }
    actualizarMonedas();
    }
    private void pedirUsuarioInicial(){
        TextInputDialog dialog = new TextInputDialog();

        dialog.setTitle("Bienvenido!");
        dialog.setHeaderText("Introduzca su nombre de usuario");
        dialog.setContentText("Usuario: ");

        Optional<String> resultado = dialog.showAndWait();
        if (resultado.isEmpty() || resultado.get().trim().isEmpty()){
            pedirUsuarioInicial();
            return;
        }
        String nombre = resultado.get().trim();
        jugador = jugadores.get(nombre);
        if (jugador == null){
            jugador = new Jugador(nombre, 10);
            mostrarAlerta("Usuario Creado: "+ nombre);
        }else {
            mostrarAlerta("Bienvenido de nuevo, "+ nombre + "\n Monedas actuales: "+jugador.getCoins()+ "\n cantidad de pokemones: "+ jugador.getPokedex().size());

        }
    }

    @FXML
    private void onTrade() {
        mostrarAlerta("Sistema de intercambio próximamente...");
    }

    @FXML
    private void onExit() {
        System.exit(0);
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
    @FXML
    private Label lblCoins;
    private void actualizarMonedas(){
        lblCoins.setText("$ "+ jugador.getCoins());
    }
    @FXML
    public void initialize(){
        pedirUsuarioInicial();
        actualizarMonedas();
    }
}