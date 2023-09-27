package com.example.datastructure;

import com.example.datastructure.drawboard.Drawboard;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;


public class FXApp extends Application {

    private Drawboard drawboard;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Application");

        drawboard = createDrawboard();
        GridPane menu = createMenuPanel();

        Pane root = new Pane();
        root.getChildren().addAll(menu, drawboard);

        primaryStage.setScene(new Scene(root, 600, 600));

        primaryStage.show();
    }

    private GridPane createMenuPanel() {
        GridPane menu = new GridPane();
        menu.setPrefSize(600, 70);

        Button squareButton = drawboard.createNewSquare("Square");
        Button rectangleButton = drawboard.createNewRectangle("Rectangle");
        Button triangleButton = drawboard.createNewTriangle("Triangle");
        Button circleButton = drawboard.createNewCircle("Circle");
        Button lineButton = drawboard.createNewLine("Line");
        Button clearButton = drawboard.createNewClear("Clear");


        menu.addRow(0, squareButton, rectangleButton, triangleButton, circleButton, lineButton, clearButton);

        return menu;
    }

    private Drawboard createDrawboard() {
        Drawboard drawboard = new Drawboard();
        drawboard.setPrefSize(600, 600);
        drawboard.setLayoutX(0);
        drawboard.setLayoutY(70);

        return drawboard;
    }
}

