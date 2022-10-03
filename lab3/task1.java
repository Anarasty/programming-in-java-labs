package com.example.lab3_pir_test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class task1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Lab3");
        Group group = new Group();
        Scene scene = new Scene(group,500,500,Color.WHEAT);
        primaryStage.setScene(scene);
        primaryStage.show();
        ///TRIANGLE
        Polygon triangle = new Polygon(50,100,150,100,100,50);
        triangle.setFill(Color.GREEN);
        group.getChildren().add(triangle);
        ///LABEL1
        Text text = new Text();
        text.setX(200);
        text.setY(80);
        text.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,16));
        text.setFill(Color.GREEN);
        text.setText("Green triangle");
        group.getChildren().add(text);
        ///SQUARE
        Stop[] stops = new Stop[] { new Stop(0, Color.GREEN), new Stop(1, Color.RED)};
        LinearGradient lg1 = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);
        Rectangle rect=new Rectangle();
        rect.setX(50);
        rect.setY(150);
        rect.setWidth(100);
        rect.setHeight(100);
        rect.setFill(lg1);
        group.getChildren().addAll(rect);
        ///LABEL2
        Text text2 = new Text();
        text2.setX(200);
        text2.setY(200);
        text2.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,16));
        text2.setFill(Color.GREEN);
        text2.setText("Gradient square");
        group.getChildren().add(text2);
        ///CIRCLE
        Ellipse elipse = new Ellipse();
        elipse.setCenterX(100);
        elipse.setCenterY(350);
        elipse.setRadiusX(50);
        elipse.setRadiusY(50);
        elipse.setFill(Color.WHEAT);
        elipse.setStroke(Color.RED);
        group.getChildren().addAll(elipse);
        ///LABEL3
        Text text3 = new Text();
        text3.setX(200);
        text3.setY(350);
        text3.setFont(Font.font("Abyssinica SIL", FontWeight.BOLD, FontPosture.ITALIC,16));
        text3.setFill(Color.GREEN);
        text3.setText("Red circle");
        group.getChildren().add(text3);
        ///LABEL4
        Text text4 = new Text();
        text4.setX(400);
        text4.setY(480);
        text4.setText("Minaeva pp-41");
        group.getChildren().add(text4);
    }
}
