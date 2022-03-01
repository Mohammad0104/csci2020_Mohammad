package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML private Label nameLabel;
    @FXML private Label nameLabel1;
    @FXML private Label nameLabel2;
    @FXML private Label nameLabel3;
    @FXML private Label nameLabel4;
    @FXML private Label nameLabel5;
    @FXML private TextField nameText;
    @FXML private PasswordField nameText1;
    @FXML private TextField nameText2;
    @FXML private TextField nameText3;
    @FXML private TextField nameText4;
    @FXML private DatePicker datePicker;
    @FXML private Label label;
    @FXML private Button button;

    @FXML
    protected void onRegisterButtonClick() {

        System.out.println(nameLabel.getText() + " " + nameText.getText() +
                nameLabel1.getText() + " " + nameText1 +
                nameLabel2.getText() + " " + nameText2 +
                nameLabel3.getText() + " " + nameText3 +
                nameLabel4.getText() + " " + nameText4 +
                nameLabel5.getText() + " " + datePicker);
    }
}







