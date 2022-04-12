package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class CreditsController {

    @FXML
    private Button quitButton;

    @FXML
    public void handleQuitBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("title-screen.fxml")));
        Stage window = (Stage) quitButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

}
