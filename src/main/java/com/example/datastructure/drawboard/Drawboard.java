package com.example.datastructure.drawboard;

import com.example.datastructure.shapes.circle.Circle;
import com.example.datastructure.shapes.line.Line;
import com.example.datastructure.shapes.rectangle.Rectangle;
import com.example.datastructure.shapes.square.Square;
import com.example.datastructure.shapes.triangle.Triangle;
import eu.hansolo.toolbox.observables.ObservableList;
import javafx.scene.Node;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Shape;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.awt.Point;

@Getter
@Setter
public class Drawboard extends Pane {

    private final Canvas canvas;

    private final GraphicsContext gc;

    private ArrayList<Point> points;

    private ArrayList<Circle> circles;

    private ArrayList<Rectangle> rectangles;

    private ArrayList<Square> squares;

    private ArrayList<Triangle> triangles;

    private ArrayList<Line> lines;

    private Shape currentShape;

    private ArrayList<Shape> shapes = new ArrayList<>();

    private double startX;

    private double startY;

    private double endX;

    private double endY;

    private ObservableList<Node> permanentShapes= new ObservableList<>();

    private Rectangle currentRectangle=null;

    private Square currentSquare = null;

    private Circle currentCircle = null;

    private Line currentLine = null;

    private Triangle currentTriangle = null;

    private boolean shapeChosen = false;


    public Drawboard() {

        circles = new ArrayList<>();
        rectangles = new ArrayList<>();
        triangles = new ArrayList<>();
        squares = new ArrayList<>();
        lines = new ArrayList<>();
        points = new ArrayList<>();
        canvas = new Canvas(800, 600);
        gc = canvas.getGraphicsContext2D();

        getChildren().add(canvas);

        canvas.setOnMousePressed(this::handleMousePressed);
        canvas.setOnMouseDragged(this::handleMouseDragged);
        canvas.setOnMouseReleased(this::handleMouseReleased);
    }

    private void handleMousePressed(MouseEvent event) {
        if (shapeChosen) {
            startX = event.getX();
            startY = event.getY();
        }
    }

    private void handleMouseDragged(MouseEvent event) {
        if (shapeChosen) {
            endX = event.getX();
            endY = event.getY();
            redraw();
        }
    }

    private void handleMouseReleased(MouseEvent event) {
        if (shapeChosen) {
            //shapes.add(currentShape);
            //add current shape to the list
            shapeChosen=false;
            redraw();
            resetCurrentShape();
        }
    }

    public Button createNewClear(String label) {

        Button button = new Button(label);
        button.setPrefSize(100, 70);
        button.setOnAction(event -> {
            this.getChildren().clear();
            System.out.println("You have chosen to clear");
        });
        permanentShapes.add(button);
        return button;
    }

    public Button createNewLine(String label) {
        Button button = new Button(label);

        button.setPrefSize(100, 70);
        button.setOnAction(event -> {
            currentLine = new Line();
            shapeChosen = true;
            System.out.println("You chose line");
        });
        permanentShapes.add(button);
        return button;
    }

    public Button createNewSquare(String label) {
        Button button = new Button(label);
        button.setPrefSize(100, 70);

        button.setOnAction(event -> {
            currentSquare = new Square();
            shapeChosen = true;
            System.out.println("You chose square");
        });
        permanentShapes.add(button);

        return button;
    }

    public Button createNewRectangle(String label) {
        Button button = new Button(label);
        button.setPrefSize(100, 70);

        button.setOnAction(event -> {
            currentRectangle = new Rectangle();
            shapeChosen = true;
            System.out.println("You chose rectangle");
        });
        permanentShapes.add(button);

        return button;
    }

    public Button createNewTriangle(String label) {
        Button button = new Button(label);
        button.setPrefSize(100, 70);

        button.setOnAction(event -> {
            currentTriangle = new Triangle();
            shapeChosen = true;
            System.out.println("You chose triangle");
        });
        permanentShapes.add(button);

        return button;
    }

    public Button createNewCircle(String label) {
        Button button = new Button(label);
        button.setPrefSize(100, 70);

        button.setOnAction(event -> {
            currentCircle = new Circle();
            shapeChosen = true;
            System.out.println("You chose circle");
        });
        permanentShapes.add(button);

        return button;
    }
    private void redraw() {
        gc.clearRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
        for (Circle circle : circles) {
            circle.draw(gc, startX, endX, startY, endY);
        }
        for (Square square:squares) {
            square.draw(gc, startX, endX, startY, endY);
        }
        for (Line line : lines) {
            line.draw(gc, startX, endX, startY, endY);
        }
        for (Rectangle rectangle: rectangles) {
            rectangle.draw(gc, startX, endX, startY, endY);
        }
        for (Triangle triangle : triangles) {
            triangle.draw(gc, startX, endX, startY, endY);
        }

        if (currentRectangle != null) {
            currentRectangle.draw(gc, startX, endX, startY, endY);
        } else if (currentLine != null) {
            currentLine.draw(gc, startX, endX, startY, endY);
        } else if (currentSquare != null) {
            currentSquare.draw(gc, startX, endX, startY, endY);
        } else if (currentCircle != null) {
            currentCircle.draw(gc, startX, endX, startY, endY);
        } else if (currentTriangle != null) {
            currentTriangle.draw(gc, startX, endX, startY, endY);
        }
    }

    private void resetCurrentShape() {
        if (currentSquare != null) {
            resetCurrentSquare();
        } else if (currentLine != null) {
            resetCurrentLine();
        } else if (currentTriangle != null) {
            resetCurrentTriangle();
        } else if (currentCircle != null) {
            resetCurrentCircle();
        } else if (currentRectangle != null) {
            resetCurrentRectangle();
        }
    }
    private void resetCurrentRectangle() {
        rectangles.add(currentRectangle.copy());
        currentRectangle = null;
    }
    private void resetCurrentCircle() {
        currentCircle=null;

    }
    private void resetCurrentSquare() {
        currentSquare = null;
    }
    private void resetCurrentLine() {
        currentLine = null;

    }
    private void resetCurrentTriangle() {
        currentTriangle = null;

    }
}
