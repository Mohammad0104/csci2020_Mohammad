module com.example.lab08 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.crypto;


    opens com.example.lab08 to javafx.fxml;
    exports com.example.lab08;
}