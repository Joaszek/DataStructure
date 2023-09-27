package com.example.datastructure;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class DrawingApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        HBox root = new HBox(10);
        root.setFillHeight(false);

        Canvas canvas = new Canvas(400, 300);
        Label infoLabel = new Label();


        VBox shapeBox = createShapeBox(infoLabel);
        shapeBox.setMinWidth(200);

        VBox colorBox = new VBox(10);
        CheckBox redCheckBox = new CheckBox("Red");
        CheckBox greenCheckBox = new CheckBox("Green");
        CheckBox blueCheckBox = new CheckBox("Blue");
        colorBox.getChildren().addAll(new Label("Choose color"), redCheckBox, greenCheckBox, blueCheckBox);
        colorBox.setMinWidth(200);


        VBox functionBox = new VBox(10);
        Button eraserButton = new Button("Rubber");
        Button saveButton = new Button("Save to file");
        functionBox.getChildren().addAll(new Label("Functions"), eraserButton, saveButton);
        functionBox.setMinWidth(200);

        HBox.setHgrow(shapeBox, Priority.ALWAYS);
        HBox.setHgrow(colorBox, Priority.ALWAYS);
        HBox.setHgrow(functionBox, Priority.ALWAYS);


        root.getChildren().addAll(shapeBox, colorBox, functionBox, canvas);

        Scene scene = new Scene(root, 650, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Paint");
        primaryStage.show();
    }

    private VBox createShapeBox(Label infoLabel) {
        VBox shapeBox = new VBox(10);
        shapeBox.getChildren().add(new Label("Choose shape"));

        String[] shapes = {"Triangle", "Rectangle", "Circle", "Line"};
        Shape[] shapeIcons = {
                createTriangle(20),
                new Rectangle(0, 0, 30, 20),
                new Circle(10),
                createThickerLine(0, 20, 20, 20, 5)
        };

        for (int i = 0; i < shapes.length; i++) {
            final String shapeName = shapes[i];
            Shape shapeIcon = shapeIcons[i];
            shapeIcon.setFill(Color.GRAY);

            shapeIcon.setOnMouseClicked(e -> {
                System.out.println("You have chosen: " + shapeName);
            });

            HBox hbox = new HBox(10, shapeIcon, new Label(shapeName));
            shapeBox.getChildren().add(hbox);
        }

        return shapeBox;
    }


    private Shape createTriangle(double size) {
        javafx.scene.shape.Polygon triangle = new javafx.scene.shape.Polygon();
        triangle.getPoints().addAll(
                size / 2.0, 0.0,
                0.0, size,
                size, size
        );
        return triangle;
    }

    private Line createThickerLine(double startX, double startY, double endX, double endY, double thickness) {
        Line line = new Line(startX, startY, endX, endY);
        line.setStrokeWidth(thickness);
        return line;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
