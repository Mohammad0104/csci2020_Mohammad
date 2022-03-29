package com.example.lab08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Insets;

import javafx.scene.control.*;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.stage.Stage;


import java.io.*;


public class App extends Application {




    private BorderPane layout;
    private TableView<StudentRecord> tableView;
    public String currentFilename = "Table";

    @Override
    public void start(Stage primaryStage) throws Exception {



        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        fileMenu.getItems().add(newMenuItem);
        newMenuItem.setOnAction(e -> newScreen());

        fileMenu.getItems().add(new SeparatorMenuItem());
        MenuItem openMenuItem = new MenuItem("Open");
        fileMenu.getItems().add(openMenuItem);
        openMenuItem.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            File file = fileChooser.showOpenDialog(primaryStage);
            currentFilename = file.getPath();
            try {
                open(tableView, currentFilename);

            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        fileMenu.getItems().add(new SeparatorMenuItem());
        MenuItem saveMenuItem = new MenuItem("Save");
        fileMenu.getItems().add(saveMenuItem);
        saveMenuItem.setOnAction(e -> {
            try {
                save(tableView, currentFilename);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });


        MenuItem saveAsMenuItem = new MenuItem("Save As...");
        fileMenu.getItems().add(saveAsMenuItem);
        saveAsMenuItem.setOnAction(e -> {
            try {
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Open Resource File");
                File file = fileChooser.showOpenDialog(primaryStage);
                currentFilename = file.getPath();
                save(tableView, currentFilename);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        fileMenu.getItems().add(new SeparatorMenuItem());
        MenuItem exitMenuItem = new MenuItem("Exit");
        fileMenu.getItems().add(exitMenuItem);
        exitMenuItem.setOnAction( e -> System.exit(0) );

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu);

        tableView = new TableView<>();

        tableView.setEditable(true);


        TableColumn<StudentRecord, String> column1 = null;
        column1 = new TableColumn<>("SID");
        column1.setCellValueFactory(new PropertyValueFactory<>("id"));


        TableColumn<StudentRecord, String> column2 = null;
        column2 = new TableColumn<>("Assignments");
        column2.setCellValueFactory(new PropertyValueFactory<>("assignment"));


        TableColumn<StudentRecord, String> column3 = null;
        column3 = new TableColumn<>("Midterm");
        column3.setCellValueFactory(new PropertyValueFactory<>("midMarks"));

        TableColumn<StudentRecord, String> column4 = null;
        column4 = new TableColumn<>("Final Exam");
        column4.setCellValueFactory(new PropertyValueFactory<>("exam"));

        TableColumn<StudentRecord, String> column5 = null;
        column5 = new TableColumn<>("Final Mark");
        column5.setCellValueFactory(new PropertyValueFactory<>("finalMarks"));

        TableColumn<StudentRecord, String> column6 = null;
        column6 = new TableColumn<>("Letter Grade");
        column6.setCellValueFactory(new PropertyValueFactory<>("grade"));

        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);
        tableView.getColumns().add(column3);
        tableView.getColumns().add(column4);
        tableView.getColumns().add(column5);
        tableView.getColumns().add(column6);

        GridPane editArea = new GridPane();
        editArea.setPadding(new Insets(10, 10, 10, 10));
        editArea.setVgap(10);
        editArea.setHgap(10);

        Label sidLabel = new Label("SID:");
        editArea.add(sidLabel, 0, 0);
        TextField sidField = new TextField();
        sidField.setPromptText("SID");
        editArea.add(sidField, 1, 0);

        Label assignLabel = new Label("Assignments:");
        editArea.add(assignLabel, 0, 1);
        TextField assignField = new TextField();
        assignField.setPromptText("Assignment/100");
        editArea.add(assignField, 1, 1);

        Label midLabel = new Label("Midterm:");
        editArea.add(midLabel, 0, 2);
        TextField midField = new TextField();
        midField.setPromptText("Midterm/100");
        editArea.add(midField, 1, 2);

        Label fExamLabel = new Label("Final exam:");
        editArea.add(fExamLabel, 0, 3);
        TextField fExamField = new TextField();
        fExamField.setPromptText("Final Exam/100");
        editArea.add(fExamField, 1, 3);

        Button addButton = new Button("Add");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String id = sidField.getText();
                float assignment = Float.parseFloat(assignField.getText());
                float midMarks = Float.parseFloat(midField.getText());
                float exam = Float.parseFloat(fExamField.getText());

                tableView.getItems().add(new StudentRecord(id, assignment, midMarks, exam));

                sidField.setText("");
                assignField.setText("");
                midField.setText("");
                fExamField.setText("");
            }
        });
        editArea.add(addButton, 1, 4);

        layout = new BorderPane();
        layout.setTop(menuBar);
        layout.setCenter(tableView);
        layout.setBottom(editArea);

        Scene scene = new Scene(layout, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Lab 08 ");
        primaryStage.show();

    }

    public void save(TableView<StudentRecord> table, String currentFilename) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentFilename));
        for (StudentRecord record: table.getItems()){
            bufferedWriter.write(String.format("%s,%f,%f,%f%n",record.getId(),record.getAssignment()
                    ,record.getMidMarks(),record.getExam()));
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void newScreen(){

        tableView.getItems().clear();
    }

    public TableView<StudentRecord> open(TableView<StudentRecord> table, String currentFileName) throws IOException{

        FileReader reader = new FileReader(currentFileName);
        BufferedReader in = new BufferedReader(reader);
        String line;
        DataSource data = new DataSource();
        ObservableList<StudentRecord> marks = FXCollections.observableArrayList();
        while((line = in.readLine()) != null) {
            if (line.trim().length() != 0) {
                String[] dataFields = line.split(",");
                marks.add(new StudentRecord(dataFields[0], Float.parseFloat(dataFields[1])
                        , Float.parseFloat(dataFields[2]), Float.parseFloat(dataFields[3])));
            }
        }
        table.setItems(marks);
        return table;




    }

    public static void main(String[] args) {
        launch(args);
    }

}