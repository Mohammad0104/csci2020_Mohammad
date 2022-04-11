package com.example.lab09;

import javafx.application.Application;

import javafx.scene.Group;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.*;
import java.net.*;



import java.net.URL;
import java.util.LinkedList;

public class HelloApplication extends Application {
    private Canvas canvas;
    @Override
    public void start(Stage primaryStage) throws Exception{
        LinkedList<Double> google = downloadStockPrices("https://query1.finance.yahoo.com/v7/finance/download/GOOG?period1=1263099600&period2=1451538000&interval=1mo&events=history&includeAdjustedClose=true");
        LinkedList<Double> apple = downloadStockPrices("https://query1.finance.yahoo.com/v7/finance/download/AAPL?period1=1263099600&period2=1451538000&interval=1mo&events=history&includeAdjustedClose=true");


        Group root = new Group();
        Canvas canvas = new Canvas(810, 700);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawLinePlot(gc);
        root.getChildren().add(canvas);

        plotLine(gc, google, Color.RED);
        plotLine(gc, apple, Color.BLUE);
        primaryStage.setTitle("Lab09");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawLinePlot(GraphicsContext gc) {
        gc.setStroke(Color.GREY);
        gc.setLineWidth(3);
        gc.strokeLine(50, 50, 50, 650);
        gc.strokeLine(50, 650, 760, 650);

    }
    private void plotLine(GraphicsContext gc, LinkedList<Double> company, Color colour){
        gc.setStroke(colour);
        gc.setLineWidth(2);
        double nextY = company.get(0);
        for (int i = 1; i < company.size();i++){
            gc.strokeLine(((i*10)+50),nextY/2,((i*10)+60), (company.get(i))/2);
            nextY = company.get(i);
        }

    }



    public LinkedList<Double> downloadStockPrices(String address) throws Exception{
        LinkedList<Double> close = new LinkedList();
        BufferedReader in = null;
        try {
            URL url = new URL(address);
            URLConnection conn = url.openConnection();
            conn.setDoOutput(false);
            conn.setDoInput(true);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            //skip first
            line = in.readLine();
            while((line = in.readLine()) != null) {
                String[] dataFields = line.split(",");
                close.add(Double.parseDouble(dataFields[4]));
            }
            // pull out the data that we want
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            in.close();
        }
        return close;
    }

    public static void main(String[] args) {
        launch(args);
    }
}