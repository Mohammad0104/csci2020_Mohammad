package com.devmate.registrationform;

import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Label for name
        Label nameLabel = new Label("Name");

        //Text Field for Name
        TextField nameText = new TextField();

        //Label for date of birth
        Label dobLabel = new Label("Date of birth");

        //date picker to choose date
        DatePicker datePicker = new DatePicker();

        //Label for gender
        Label genderLabel = new Label("gender");

        //Toggle group of radio button
        ToggleGroup groupGender = new ToggleGroup();
        RadioButton maleRadio = new RadioButton("male");
        maleRadio.setToggleGroup(groupGender);
        RadioButton femaleRadio = new RadioButton("female");
        femaleRadio.setToggleGroup(groupGender);

        //Label for technologies known
        Label technologiesLabel = new Label("Technologies Known");

        //Check box for education
        CheckBox javaCheckBox = new CheckBox("Java");
        javaCheckBox.setIndeterminate(false);
        CheckBox dotnetCheckBox = new CheckBox("Python");
        javaCheckBox.setIndeterminate(false);


        //Label for education
        Label educationLabel = new Label("Educational qualification");

        //list view for educational qualification
        ListView eduList = new ListView();
        ObservableList data = FXCollections.observableArrayList();
        data.addAll("Bachelor Degree", "Plus 2", "Master's", "Phd.");
        eduList.setItems(data);
        eduList.setPrefSize(100, 100);

        //Label for Location
        Label locationLabel = new Label("Location");

        //Choice box for location
        ChoiceBox locationChoiceBox = new ChoiceBox();
        locationChoiceBox.getItems().addAll(
                "Kathmandu", "Delhi", "Bhaktapur", "Mumbai", "New York"
        );

        //Label for register
        Button buttonRegister = new Button("Register");

        //Crating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for pane
        gridPane.setMinSize(500, 300);

        //Setting the padding
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(dobLabel, 0, 1);
        gridPane.add(datePicker, 1, 1);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(maleRadio, 1, 2);
        gridPane.add(femaleRadio, 2, 2);

        gridPane.add(technologiesLabel, 0, 3);
        gridPane.add(javaCheckBox, 1, 3);
        gridPane.add(dotnetCheckBox, 2, 3);

        gridPane.add(educationLabel, 0, 4);
        gridPane.add(eduList, 1, 4);

        gridPane.add(locationLabel, 0, 5);
        gridPane.add(locationChoiceBox, 1, 5);

        gridPane.add(buttonRegister, 2, 7);

        //Styling nodes
        buttonRegister.setStyle(
                "-fx-background-color:darkslateblue; -fx-text-fill: white;"
        );
        nameLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        dobLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        genderLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        technologiesLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        educationLabel.setStyle("-fx-font:normal bold 15px 'serif' ");
        locationLabel.setStyle("-fx-font:normal bold 15px 'serif' ");

        //Setting the background color
        gridPane.setStyle("-fx-background-color:BEIGE;");

        //Creating a scene object
        Scene scene = new Scene(gridPane);


        //Setting the title of stage
        stage.setTitle("Registration Form");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}