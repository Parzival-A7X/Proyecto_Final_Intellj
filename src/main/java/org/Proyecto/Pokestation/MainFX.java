package org.Proyecto.Pokestation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/org/Proyecto/Pokestation/view/Menu.fxml")
        );

        Scene scene = new Scene(loader.load(), 1000, 700);

        stage.setTitle("PokeStation V1.0");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}