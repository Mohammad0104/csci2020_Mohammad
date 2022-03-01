package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {





    @FXML
    private Label nameLabel;
    private Label nameLabel1;
    private Label nameLabel2;
    private Label nameLabel3;
    private Label nameLabel4;
    private Label nameLabel5;
    private TextField nameText;
    private PasswordField nameText1;
    private TextField nameText2;
    private TextField nameText3;
    private TextField nameText4;
    private DatePicker datePicker;



    @FXML
    public void register(ActionEvent e) {
        System.out.println(nameLabel.getText()+" "+ nameText.getText() + "\n" +
                nameLabel1.getText()+" "+nameText1.getText() + "\n" +
                nameLabel2.getText()+" "+nameText2.getText() + "\n" +
                nameLabel3.getText()+" "+nameText3.getText() + "\n" +
                nameLabel4.getText()+" "+nameText4 + "\n" +
                nameLabel5.getText()+" "+datePicker.getValue());
    }
}





