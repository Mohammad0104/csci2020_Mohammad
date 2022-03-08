module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.devmate.registrationform;
    opens com.devmate.registrationform to javafx.fxml;
}