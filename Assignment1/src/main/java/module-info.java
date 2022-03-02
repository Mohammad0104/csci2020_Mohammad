module com.example.mediatorpattern {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mediatorpattern to javafx.fxml;
    exports com.example.mediatorpattern;
}