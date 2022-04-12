package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GameController {

    //Easy Level FXML Start ##############################################
    @FXML private Line EasyLine1;

    @FXML private Line EasyLine2;

    @FXML private Text EasyQue1;

    @FXML private Button EasyQue1Ch1;

    @FXML private Button EasyQue1Ch2;

    @FXML private Button EasyQue1Ch3;

    @FXML private Button EasyQue1Ch4;

    @FXML private Text EasyQue2;

    @FXML private Button EasyQue2Ch1;

    @FXML private Button EasyQue2Ch2;

    @FXML private Button EasyQue2Ch3;

    @FXML private Button EasyQue2Ch4;

    @FXML private Text EasyQue3;

    @FXML private Button EasyQue3Ch1;

    @FXML private Button EasyQue3Ch2;

    @FXML private Button EasyQue3Ch3;

    @FXML private Button EasyQue3Ch4;

    @FXML private Button EasySubmitButton;

    @FXML private Text EasylevelTitle;

    @FXML private AnchorPane levelEasyPane;
    //Easy Level FXML end ###############################################



    //MediumLevel FXML start ##############################################
    @FXML private Line MediumLIne2;

    @FXML private AnchorPane MediumLevelPane;

    @FXML private Text MediumLevelTitle;

    @FXML private Line MediumLine1;

    @FXML private Text MediumQue1;

    @FXML private Button MediumQue1Ch1;

    @FXML private Button MediumQue1Ch2;

    @FXML private Button MediumQue1Ch3;

    @FXML private Button MediumQue1Ch4;

    @FXML private Text MediumQue2;

    @FXML private Button MediumQue2Ch1;

    @FXML private Button MediumQue2Ch2;

    @FXML private Button MediumQue2Ch3;

    @FXML private Button MediumQue2Ch4;

    @FXML private Text MediumQue3;

    @FXML private Button MediumQue3Ch1;

    @FXML private Button MediumQue3Ch2;

    @FXML private Button MediumQue3Ch3;

    @FXML private Button MediumQue3Ch4;

    @FXML private Button MediumSubmitButton;
    //MediumLevel FXML end ###############################################



    //Hard Level FXML Start  ##############################################
    @FXML private Line HardLine1;

    @FXML private AnchorPane HardLine2;

    @FXML private Text HardQue1;

    @FXML private Button HardQue1Ch1;

    @FXML private Button HardQue1Ch2;

    @FXML private Button HardQue1Ch3;

    @FXML private Button HardQue1Ch4;

    @FXML private Text HardQue2;

    @FXML private Button HardQue2Ch1;

    @FXML private Button HardQue2Ch2;

    @FXML private Button HardQue2Ch3;

    @FXML private Button HardQue2Ch4;

    @FXML private Text HardQue3;

    @FXML private Button HardQue4Ch1;

    @FXML private Button HardQue4Ch2;

    @FXML private Button HardQue4Ch3;

    @FXML private Button HardQue4Ch4;

    @FXML private Button HardSubmitButton;

    @FXML private Text LevelHardTitle;
    //Hard Level FXML End #################################################


    //Extreme Level FXML Start ###########################################
    @FXML private Line ExtremeLine1;

    @FXML private Line ExtremeLine2;

    @FXML private AnchorPane ExtremePane;

    @FXML private Text ExtremeQue1;

    @FXML private Button ExtremeQue1Ch1;

    @FXML private Button ExtremeQue1Ch2;

    @FXML private Button ExtremeQue1Ch3;

    @FXML private Button ExtremeQue1Ch4;

    @FXML private Text ExtremeQue2;

    @FXML private Button ExtremeQue2Ch1;

    @FXML private Button ExtremeQue2Ch2;

    @FXML private Button ExtremeQue2Ch3;

    @FXML private Button ExtremeQue2Ch4;

    @FXML private Text ExtremeQue3;

    @FXML private Button ExtremeQue3Ch1;

    @FXML private Button ExtremeQue3Ch2;

    @FXML private Button ExtremeQue3Ch3;

    @FXML private Button ExtremeQue3Ch4;

    @FXML private Button ExtremeSubmitButton;

    @FXML private Text LevelExtremeTitle;
    //Extreme Level FXML End  #############################################

    @FXML
    private AnchorPane gamePane;

    @FXML
    private Text gameTitle;

    @FXML
    private Button levelEasy;

    @FXML
    private Button levelExtreme;

    @FXML
    private Button levelHard;

    @FXML
    private Button levelMedium;

    @FXML
    private Button quitButton;

    @FXML
    void OnActionLevelEasy(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("levelEasy.fxml")));
        Stage window = (Stage) levelEasy.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    @FXML
    void handleQuitBtn(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("title-screen.fxml")));
        Stage window = (Stage) quitButton.getScene().getWindow();
        window.setScene(new Scene(root));
    }

    //Easy Level ####################################################################
    @FXML
    void OnActionEasyQue1Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionEasyQue1Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionEasyQue1Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionEasyQue1Ch4(ActionEvent event) {

    }

    @FXML
    void OnActionEasyQue2Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionEasyQue2Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionEasyQue2Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionEasyQue3Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionEasyQue3Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionEasyQue3Ch4(ActionEvent event) {

    }

    @FXML
    void OnActionEasySubmitButton(ActionEvent event) {

    }
    //End of Easy Level##############################################################

    @FXML
    void OnActionLevelMedium(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("levelMedium.fxml")));
        Stage window = (Stage) levelMedium.getScene().getWindow();
        window.setScene(new Scene(root));

    }

    //Start of Medium Level #########################################################
    @FXML
    void OnActionMQ4Q4(ActionEvent event) {

    }

    @FXML
    void OnActionMediumQue1Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionMediumQue1Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionMediumQue1Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionMediumQue2Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionMediumQue2Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionMediumQue2Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionMediumQue3Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionMediumQue3Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionMediumQue3Ch4(ActionEvent event) {

    }

    @FXML
    void OnActionMediumSubmitButton(ActionEvent event) {

    }
    //End of Medium Level ###########################################################


    @FXML
    void OnActionLevelHard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("levelHard.fxml")));
        Stage window = (Stage) levelHard.getScene().getWindow();
        window.setScene(new Scene(root));

    }

    //Start of Hard Level ###########################################################
    @FXML
    void OnActionHardQue1Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue1Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue1Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue1Ch4(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue2Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue2Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue2Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue2Ch4(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue4Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue4Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue4Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionHardQue4Ch4(ActionEvent event) {

    }

    @FXML
    void OnActionHardSubmitButton(ActionEvent event) {

    }

    //End of Hard Level #############################################################

    @FXML
    void OnActionLevelExtreme(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("levelExtreme.fxml")));
        Stage window = (Stage) levelExtreme.getScene().getWindow();
        window.setScene(new Scene(root));

    }


    //Start of Extreme Level ########################################################
    @FXML
    void OnActionExtremeQue1Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue1Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue1Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue1Ch4(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue2Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue2Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue2Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue3Ch1(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue3Ch2(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue3Ch3(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeQue3Ch4(ActionEvent event) {

    }

    @FXML
    void OnActionExtremeSubmitButton(ActionEvent event) {

    }
    //End of Extreme Level ##########################################################







}
