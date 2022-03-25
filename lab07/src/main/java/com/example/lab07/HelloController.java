package com.example.lab07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;


public class HelloController implements Initializable {

    @FXML
    private PieChart pieChart;


    public void initialize(URL url, ResourceBundle resourceBundle) {
        int[] data = getCounts();

        // PIE CHART
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Flash Flood", data[0]),
                        new PieChart.Data("Tornado", data[1]),
                        new PieChart.Data("Severe Thunderstorm", data[2]),
                        new PieChart.Data("Special Marine", data[3])
                );

        pieChart.setData(pieChartData);

    }

    public int[] getCounts() {

        String file = "B:\\2nd Year\\2nd semester\\lab07\\src\\main\\java\\com\\example\\lab07/weatherwarnings-2015.csv";
        BufferedReader reader = null;
        String line = "";

        // Storing Counts for each incident
        int[] counts = new int[4];
        try {
            reader = new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                if (Objects.equals(5, "FLASH FLOOD")) {
                    counts[0] +=  1;
                }

                else if (Objects.equals(5, "SEVERE THUNDERSTORM")) {
                    counts[1] +=  1;
                }

                else if (Objects.equals(5, "SPECIAL MARINE")) {
                    counts[2] +=  1;
                }

                else if (Objects.equals(5, "TORNADO")) {
                    counts[3] +=  1;
                }
            }
        } catch (Exception pie) {
            pie.printStackTrace();
        } finally {


            try {
                reader.close();
            } catch (IOException pie) {
                pie.printStackTrace();
            }

        }
        return counts;

    }
}
