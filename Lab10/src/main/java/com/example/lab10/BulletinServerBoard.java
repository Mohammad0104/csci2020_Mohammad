package com.example.lab10;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;
import java.net.*;

public class BulletinServerBoard extends Application {
    ServerSocket serverSocket;
    Socket clientSocket = null;
    public static int port = 5328;


    public void handleRequests() throws IOException {
        System.out.println("Bulletin Board Server Listening on " + port);
        while (true) {
            clientSocket = serverSocket.accept();
            System.out.println("Accepted connection : " + clientSocket);
            BulletinHandlerBoard handler = new BulletinHandlerBoard(clientSocket);
            Thread handlerThread = new Thread(handler);
            handlerThread.start();
        }
    }

    @Override
    public void start(Stage primaryStage) throws IOException{
        Parent root = extracted2();
        primaryStage.setTitle("Bulletin Board Server");
        TextArea textArea = new TextArea();
        Button button = new Button("Exit");
        button.setMinWidth(50);

        button.setOnAction(action -> {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.exit(0);
        });

        BufferedReader readIn = extracted();
        String line;
        while ((line = readIn.readLine()) != null) {
            textArea.setText(line);
        }
        textArea.setMinHeight(350);

        VBox vbox = new VBox(textArea, button);
        Scene scene = new Scene(vbox, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private Parent extracted2() throws IOException {
        return FXMLLoader.load(getClass().getResource("sample.fxml"));
    }

    private BufferedReader extracted() throws FileNotFoundException {
        return new BufferedReader(new FileReader("messages.txt"));
    }
    public void serverBoard() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Bulliten Board Server");
        GridPane gridPane = new GridPane();
        Label message = new Label("Message");


        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(message,1,1);
        TextArea messageField = new TextArea();
        gridPane.add(messageField, 3, 2);
        messageField.setMinWidth(200);
        messageField.setMinHeight(200);

        Button exit = new Button("Exit");

        gridPane.add(exit, 3,4);

        primaryStage.setScene(new Scene(gridPane, 500, 400));
        primaryStage.show();
    }
    public static void main(String[] args) {
        try{
            BulletinServerBoard server = new BulletinServerBoard();
            server.handleRequests();
            launch();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}