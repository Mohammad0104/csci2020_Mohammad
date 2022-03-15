package com.example.demo3;

import javafx.application.Application;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    private static Color[] pieColours = {
            Color.AQUA, Color.GOLD, Color.DARKORANGE,
            Color.DARKSALMON, Color.LAWNGREEN, Color.PLUM
    };
    private static double[] avgHousingPricesByYear = {
            247381.0,264171.4,287715.3,294736.1,
            308431.4,322635.9,340253.0,363153.7
    };
    private static double[] avgCommercialPricesByYear = {
            1121585.3,1219479.5,1246354.2,1295364.8,
            1335932.6,1472362.0,1583521.9,1613246.3
    };
    private static String[] ageGroups = {
            "18-25", "26-35", "36-45", "46-55", "56-65", "65+"
    };
    private static int[] purchasesByAgeGroup = {
            648, 1021, 2453, 3173, 1868, 2247
    };
    final static String avg_house1 = "house1";
    final static String avg_house2 = "house2";
    final static String avg_house3 = "house3";
    final static String avg_house4 = "house4";
    final static String avg_house5 = "house5";
    final static String avg_house6 = "house6";
    final static String avg_house7 = "house7";
    final static String avg_house8 = "house8";
    private Object PieChart;

    @Override public void start(Stage stage) {

        stage.setTitle("Lab06");
        stage.setWidth(500);
        stage.setHeight(500);

        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("18-25", 648),
                        new PieChart.Data("26-35", 1021),
                        new PieChart.Data("36-45", 2453),
                        new PieChart.Data("46-55", 3173),
                        new PieChart.Data("56-65", 1868),
                        new PieChart.Data("65+", 2247));
        stage.setTitle("Bar Chart Sample");


        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("bar chart");
        XYChart.Series series1 = new XYChart.Series();

        series1.getData().add(new XYChart.Data(avg_house1, 247381.0));
        series1.getData().add(new XYChart.Data(avg_house2, 264171.4));
        series1.getData().add(new XYChart.Data(avg_house3, 287715.3));
        series1.getData().add(new XYChart.Data(avg_house4, 294736.1));
        series1.getData().add(new XYChart.Data(avg_house5, 308431.4));
        series1.getData().add(new XYChart.Data(avg_house6, 322635.9));
        series1.getData().add(new XYChart.Data(avg_house7, 340253.0));
        series1.getData().add(new XYChart.Data(avg_house8, 363153.7 ));



        XYChart.Series series2 = new XYChart.Series();

        series2.getData().add(new XYChart.Data(avg_house1, 1121585.3));
        series2.getData().add(new XYChart.Data(avg_house2, 1219479.5));
        series2.getData().add(new XYChart.Data(avg_house3, 1246354.2));
        series2.getData().add(new XYChart.Data(avg_house4, 1295364.8));
        series2.getData().add(new XYChart.Data(avg_house5, 1335932.6));
        series2.getData().add(new XYChart.Data(avg_house6, 1472362.0));
        series2.getData().add(new XYChart.Data(avg_house7, 1583521.9));
        series2.getData().add(new XYChart.Data(avg_house8, 1613246.3 ));


        FlowPane root = new FlowPane();
        root.getChildren().addAll(pieChartData,bc);

        PieChart chart = new PieChart(pieChartData);
        Scene scene = new Scene(new Group());
        Scene scene1  = new Scene(bc,400,400);
        ((Group) scene.getRoot()).getChildren().add(chart);
        bc.getData().addAll(series1, series2);

        stage.setScene(scene);
        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}