package com.example.mediatorpattern;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private TextArea ChatBox;

    @FXML
    private Label ChatBoxLable;

    @FXML
    private Button SendButton;

    @FXML
    private TextField Username;

    @FXML
    private Label UsernameLable;

    @FXML
    private AnchorPane scenePane;

    @FXML
    void OnActionSendButton(ActionEvent event) {
        System.out.println(Username.getText()+": " + "\n" + ChatBox.getText());

    }
}