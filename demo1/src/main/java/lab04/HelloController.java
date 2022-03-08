package lab04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label fullNameLabel;
    @FXML
    private Label userNameLabel;
    @FXML
    private Label passwordLabel;
    @FXML
    private Label phoneLabel;
    @FXML
    private Label dateOfBirthLabel;
    @FXML
    private Label emailLabel;

    @FXML
    private TextField fullNameField;
    @FXML
    private TextField userNameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField phoneField;
    @FXML
    private DatePicker dateOfBirthField;
    @FXML
    private TextField emailField;

    public void register(ActionEvent e) {
        String input = phoneField.getText();
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "$1-$2-$3");

        System.out.println(userNameLabel.getText() + " " + userNameField.getText() + "\n" +
                passwordLabel.getText() + " " + passwordField.getText() + "\n" +
                fullNameLabel.getText() + " " + fullNameField.getText() + "\n" +
                emailLabel.getText() + " " + emailField.getText() + "\n" +
                phoneLabel.getText() + " " + number + "\n" +
                dateOfBirthLabel.getText() + " " + dateOfBirthField.getValue());
    }
}
