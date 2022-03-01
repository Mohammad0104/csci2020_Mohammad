package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;



         @FXML private Label label;
         @FXML private Button buttonRegister;

    public void onRegister(ActionEvent actionEvent) {
        buttonRegister.setVisible(false);
        label.setVisible(true);
    }
    }



