package com.example.lab10;




import javafx.application.Application;
;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

import java.io.*;
import java.net.*;


public class BulletinClientBoard extends Application{
    private static Socket sock;

    private BorderPane layout;
    BufferedReader stdin;
    PrintWriter os;
    public String messageSent;


    public void start(Stage primaryStage) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Bulletin Board Client");
        TextArea textArea = new TextArea();
        Button bSend = new Button("Send");
        bSend.setMinWidth(50);

        Button bExit = new Button("Exit");
        bExit.setMinWidth(50);
        bExit.setOnAction(action -> {
            try {
                sock.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.exit(0);
        });

        GridPane editArea = new GridPane();
        editArea.setPadding(new Insets(10, 10, 10, 10));
        editArea.setVgap(10);
        editArea.setHgap(10);
        textArea.setMinHeight(350);

        Label lUsername = new Label("Username:");
        editArea.add(lUsername, 0, 0);
        TextField usernameField = new TextField();
        usernameField.setPromptText("Username");
        editArea.add(usernameField, 1, 0);

        Label message = new Label("Message:");
        editArea.add(message, 0, 1);
        TextField messageField = new TextField();
        messageField.setPromptText("Message");
        editArea.add(messageField, 1, 1);

        bSend.setOnAction(action ->{
            String userName = usernameField.getText();
            String message1 = messageField.getText();

            messageSent = (userName + message1);
            usernameField.setText("");
            messageField.setText("");
            primaryStage.show();
            try{
                stdin = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                os = new PrintWriter(sock.getOutputStream());
                os.write(messageSent);
                os.flush();
                String returnMess;
                returnMess = stdin.readLine();
                System.out.println(returnMess);
            }catch(IOException e3){
                e3.printStackTrace();
            }
            os.write(messageSent);
            os.flush();
        });

        layout = new BorderPane();
        layout.setTop(editArea);
        layout.setLeft(bSend);
        layout.setBottom(bExit);
        Scene scene = new Scene(layout, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException {
        try {
            sock = new Socket("localhost", 5328);
            System.out.println("Connected");
            launch(args);
        } catch (Exception e) {
            System.err.println("Cannot connect to the server, try again later.");
            sock.close();
            System.exit(1);
        }

        sock.close();
    }


}
