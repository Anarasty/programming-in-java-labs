package com.example.lab3_pir_test;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.Arrays;

public class task2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        String Python = "Python";
        String Java = "Java";
        String C_sharp = "C#";
        String C_plus = "C++";
        String Javascript = "Javascript";
        String Ruby = "Ruby";
        String Kotlin = "Kotlin";
        String Php = "PHP";
        String Go = "Go";

        CategoryAxis xaxis= new CategoryAxis();
        NumberAxis yaxis = new NumberAxis(1,20,5);
        xaxis.setLabel("Languages");
        yaxis.setLabel("Number of students");

        xaxis.tickLabelFontProperty().set(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,18));
        xaxis.setTickLabelFill(Color.BLUE);
        yaxis.tickLabelFontProperty().set(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,18));
        yaxis.setTickLabelFill(Color.BLUE);

        BarChart<String,Float> bar = new BarChart(xaxis,yaxis);
        bar.setTitle("PP-41 CHART DIAGRAM");
        XYChart.Series<String,Float> series = new XYChart.Series<>();
        series.setName("Student number");
        series.getData().add(new XYChart.Data(Python,20));
        series.getData().add(new XYChart.Data(Java,6));
        series.getData().add(new XYChart.Data(C_sharp,11));
        series.getData().add(new XYChart.Data(C_plus,19));
        series.getData().add(new XYChart.Data(Javascript,16));
        series.getData().add(new XYChart.Data(Ruby,4));
        series.getData().add(new XYChart.Data(Kotlin,7));
        series.getData().add(new XYChart.Data(Php,2));
        series.getData().add(new XYChart.Data(Go,5));

        bar.getData().add(series);

        Group root = new Group();
        root.getChildren().add(bar);
        Scene scene = new Scene(root,500,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PP-41 CHART DIAGRAM");
        primaryStage.show();
    }
}


//        CategoryAxis newxAxis = new CategoryAxis();
//        newxAxis.setCategories(FXCollections.<String>
//                observableArrayList(Arrays.asList("Java","Python","C#","C++","Javascript","Ruby","Kotlin","PHP","Go")));
//        newxAxis.setLabel("languages");
//        newxAxis.tickLabelFontProperty().set(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,18));
//        newxAxis.setTickLabelFill(Color.BLUE);
//
//        NumberAxis newyAxis = new NumberAxis();
//        newyAxis.setLabel("Students study");
//
//        BarChart<String, Number> newChart = new BarChart<>(newxAxis, newyAxis);
//        newChart.setTitle("PP-41 programming languages");
//
//        XYChart.Series<String, Number> newseries1 = new XYChart.Series<>();
//        newseries1.setName("Good");
//        newseries1.getData().add(new XYChart.Data<>("Java", 10));
//
//        XYChart.Series<String, Number> newseries2 = new XYChart.Series<>();
//        newseries2.setName("Orange");
//        newseries2.getData().add(new XYChart.Data<>("Python", 15));
//
//        XYChart.Series<String, Number> newseries3 = new XYChart.Series<>();
//        newseries3.setName("Green");
//        newseries3.getData().add(new XYChart.Data<>("C#", 6));
//
//        XYChart.Series<String, Number> newseries4 = new XYChart.Series<>();
//        newseries4.setName("Blue");
//        newseries4.getData().add(new XYChart.Data<>("C++", 9));
//
//        XYChart.Series<String, Number> newseries5 = new XYChart.Series<>();
//        newseries5.setName("Yellow");
//        newseries5.getData().add(new XYChart.Data<>("Javascript", 24));
//
//        XYChart.Series<String, Number> newseries6 = new XYChart.Series<>();
//        newseries6.setName("Brown");
//        newseries6.getData().add(new XYChart.Data<>("Ruby", 3));
//
//        XYChart.Series<String, Number> newseries7 = new XYChart.Series<>();
//        newseries7.setName("Grey");
//        newseries7.getData().add(new XYChart.Data<>("Kotlin", 6));
//
//        XYChart.Series<String, Number> newseries8 = new XYChart.Series<>();
//        newseries8.setName("Violet");
//        newseries8.getData().add(new XYChart.Data<>("PHP", 13));
//
//        XYChart.Series<String, Number> newseries9 = new XYChart.Series<>();
//        newseries9.setName("Pink");
//        newseries9.getData().add(new XYChart.Data<>("Go", 22));
//
//        newChart.getData().addAll(newseries1, newseries2, newseries3, newseries4, newseries5, newseries6, newseries7,newseries8,newseries9);
//
//        Group root = new Group(newChart);
//
//        Scene scene = new Scene(root, 1000, 1000);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("JavaFX Chart - Bar Chart Example");
//        primaryStage.show();