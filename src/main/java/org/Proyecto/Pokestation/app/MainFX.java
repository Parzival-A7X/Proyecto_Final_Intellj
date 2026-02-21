package org.Proyecto.Pokestation.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class MainFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // La ruta debe comenzar con "/" para buscar desde la raíz de recursos
        URL url = getClass().getClassLoader().getResource("view/main-view.fxml");
        System.out.println("URL: " + url);
        if (url == null) {
            System.err.println("No se encontró el archivo FXML");
            return;
        }
        FXMLLoader loader = new FXMLLoader(url);
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Pokestation Gachapon");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
