package com.example.lab05;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    TableView<HelloController>table;
    @Override
    public void start(Stage Stage) throws IOException {



        TableColumn<HelloController, String> Sid = new TableColumn<>("Sid");
        Sid.setMaxWidth(75);
        Sid.setCellValueFactory(new  PropertyValueFactory<>("Sid"));

        TableColumn<HelloController, Float> Assignment = new TableColumn<>("Assignment");
        Assignment.setMaxWidth(75);
        Assignment.setCellValueFactory(new  PropertyValueFactory<>("Assignment"));

        TableColumn<HelloController, Float> Midterm = new TableColumn<>("Midterm");
        Midterm.setMaxWidth(75);
        Midterm.setCellValueFactory(new  PropertyValueFactory<>("Midterm"));

        TableColumn<HelloController, Float> FinalExam = new TableColumn<>("FinalExam");
        FinalExam.setMaxWidth(75);
        FinalExam.setCellValueFactory(new  PropertyValueFactory<>("FinalExam"));

        TableColumn<HelloController, Float> FinalMark = new TableColumn<>("FinalMark");
        FinalMark.setMaxWidth(75);
        FinalMark.setCellValueFactory(new  PropertyValueFactory<>("FinalMark"));

        TableColumn<HelloController, String> LetterGrade = new TableColumn<>("LetterGrade");
        LetterGrade.setMaxWidth(75);
        LetterGrade.setCellValueFactory(new  PropertyValueFactory<>("LetterGrade"));


        table = new TableView<>();
        table.setItems(getMarks());
        table.getColumns().addAll(Sid, Assignment, Midterm, FinalExam, FinalMark, LetterGrade);



        Scene scene = new Scene(table);
        Stage.setTitle("lab05");
        Stage.setScene(scene);
        Stage.show();
    }

    public ObservableList<HelloController> getMarks() {
        ObservableList<HelloController> marks =
                FXCollections.observableArrayList();
        // Student ID, Assignments, Midterm, Final exam
        marks.add(new HelloController("100100100", 75.0f, 68.0f, 54.25f));
        marks.add(new HelloController("100100101", 70.0f, 69.25f, 51.5f));
        marks.add(new HelloController("100100102", 100.0f, 97.0f, 92.5f));
        marks.add(new HelloController("100100103", 90.0f, 88.5f, 68.75f));
        marks.add(new HelloController("100100104", 72.25f, 74.75f, 58.25f));
        marks.add(new HelloController("100100105", 85.0f, 56.0f, 62.5f));
        marks.add(new HelloController("100100106", 70.0f, 66.5f, 61.75f));
        marks.add(new HelloController("100100107", 55.0f, 47.0f, 50.5f));
        marks.add(new HelloController("100100108", 40.0f, 32.5f, 27.75f));
        marks.add(new HelloController("100100109", 82.5f, 77.0f, 74.25f));
        return marks;
    }
    public static void main(String[] args) {
        launch(args);
    }
    }

