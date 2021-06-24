package com.o9uzdev.javaFxRandomColorChanger;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);

        Label label = new Label("Hello Java Fx");
        label.setFont(new Font(24));
        label.setPadding(new Insets(50));

        Button button = new Button("Random Color");

        root.getChildren().addAll(label, button);

        stage.setScene(new Scene(root, 500,500));
        stage.setTitle("Java Fx Random Color Changer");
        stage.show();
    }
}