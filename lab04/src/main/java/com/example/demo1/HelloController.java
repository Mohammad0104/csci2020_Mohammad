package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;


     @FXML
     public void onRegister(ActionEvent e) {
        System.out.println("Welcome to JavaFX Application!");
    }
}