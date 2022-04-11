module com.example.lab09 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.lab09 to javafx.fxml;
    exports com.example.lab09;
}