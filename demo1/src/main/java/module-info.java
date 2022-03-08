module com.example.demo1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.HelloApplication to javafx.fxml;
    exports com.example.HelloApplication;
    exports lab04;
    opens lab04 to javafx.fxml;
}