package com.example.datastructure;

import com.example.datastructure.shapes.circle.Circle;
import com.example.datastructure.shapes.line.Line;
import com.example.datastructure.shapes.rectangle.Rectangle;
import com.example.datastructure.shapes.square.Square;
import com.example.datastructure.shapes.triangle.Triangle;
import eu.hansolo.toolbox.observables.ObservableList;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class FXApp extends Application {

    private Pane drawboard;
    private ObservableList<Node> permanentShapes= new ObservableList<>();;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Application");

        GridPane menu = createMenuPanel();
        drawboard = createDrawboard();

        Circle circle1 = new Circle(100, 100, 50);

        Rectangle rectangle1 = new Rectangle(300, 300, 100, 200);

        Triangle triangle1 = new Triangle(100, 20, 200, 200, 450, 400);

        Square square1 = new Square(450,450,100);

        Line line1 = new Line(580, 0, 580, 580);

        drawboard.getChildren().add(line1);
        drawboard.getChildren().add(square1);
        drawboard.getChildren().add(triangle1);
        drawboard.getChildren().add(rectangle1);
        drawboard.getChildren().add(circle1);

        Pane root = new Pane();
        root.getChildren().addAll(menu, drawboard);

        primaryStage.setScene(new Scene(root, 600, 600));

        primaryStage.show();
    }

    private GridPane createMenuPanel() {
        GridPane menu = new GridPane();
        menu.setPrefSize(600, 70);

        Button squareButton = createNewSquare("Square");
        Button rectangleButton = createNewRectangle("Rectangle");
        Button triangleButton = createNewTriangle("Triangle");
        Button circleButton = createNewCircle("Circle");
        Button lineButton = createNewLine("Line");
        Button clearButton = createNewClear("Clear");

        menu.addRow(0, squareButton, rectangleButton, triangleButton, circleButton, lineButton, clearButton);

        return menu;
    }

    private Button createNewClear(String label) {
        Button button = new Button(label);

        button.setOnAction(event -> {
            drawboard.getChildren().clear();
        });
        permanentShapes.add(button);
        return button;
    }

    private Button createNewLine(String label) {
        Button button = new Button(label);

        button.setOnAction(event -> {
            Line line1 = new Line(580, 0, 580, 580);
            line1.setFill(Color.BLUE);
            drawboard.getChildren().add(line1);
        });
        permanentShapes.add(button);
        return button;
    }

    private Pane createDrawboard() {
        Pane drawboard = new Pane();
        drawboard.setPrefSize(600, 600);
        drawboard.setLayoutX(0);
        drawboard.setLayoutY(70);

        return drawboard;
    }

    private Button createNewSquare(String label) {
        Button button = new Button(label);
        button.setOnAction(event -> {
            Square square1 = new Square(450,450,100);
            square1.setFill(Color.BLUE);
            drawboard.getChildren().add(square1);
        });
        permanentShapes.add(button);

        return button;
    }

    private Button createNewRectangle(String label) {
        Button button = new Button(label);

        button.setOnAction(event -> {
            Rectangle rectangle1 = new Rectangle(300, 300, 100, 200);
            rectangle1.setFill(Color.BLUE);
            drawboard.getChildren().add(rectangle1);
        });
        permanentShapes.add(button);

        return button;
    }

    private Button createNewTriangle(String label) {
        Button button = new Button(label);

        button.setOnAction(event -> {
            Triangle triangle1 = new Triangle(100, 20, 200, 200, 450, 400);
            triangle1.setFill(Color.BLUE);
            drawboard.getChildren().add(triangle1);
        });
        permanentShapes.add(button);

        return button;
    }

    private Button createNewCircle(String label) {
        Button button = new Button(label);

        button.setOnAction(event -> {
            Circle circle = new Circle(100, 100, 50);
            circle.setFill(Color.BLUE);
            drawboard.getChildren().add(circle);
        });
        permanentShapes.add(button);

        return button;
    }
}

