package com.example.finalproject;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Objects;

public class TitleScreenController {
    // Create buttons
    @FXML private Button creditsButton;
    @FXML private Button exitButton;
    @FXML private Button leaderboardButton;
    @FXML private Button optionsButton;
    @FXML private Button startButton;

    // Handles the action on the Start Button
    public void handleStartBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("game.fxml")));
        Stage window = (Stage) startButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void handleLeaderboardBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("leaderboards.fxml")));
        Stage window = (Stage) leaderboardButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void handleOptionsBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("options.fxml")));
        Stage window = (Stage) optionsButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void handleCreditsBtn() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("credits.fxml")));
        Stage window = (Stage) creditsButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    public void exitGame() throws Exception {
        Stage window = (Stage) exitButton.getScene().getWindow();
        window.close();
    }


}
