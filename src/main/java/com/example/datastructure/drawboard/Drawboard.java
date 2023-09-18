package com.example.datastructure.drawboard;

import com.example.datastructure.shapes.circle.Circle;
import com.example.datastructure.shapes.rectangle.Rectangle;
import com.example.datastructure.shapes.square.Square;
import com.example.datastructure.shapes.triangle.Triangle;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
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

    public Drawboard() {
        points = new ArrayList<>();
        canvas = new Canvas(800, 600); // You can set canvas dimensions as required
        gc = canvas.getGraphicsContext2D();

        getChildren().add(canvas);

        canvas.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            points.add(new Point((int) event.getX(), (int) event.getY()));
            repaint();
        });

        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, event -> {
            points.add(new Point((int) event.getX(), (int) event.getY()));
            repaint();
        });
    }

    private void repaint() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.setFill(Color.BLACK);
        for (Point point : points) {
            gc.fillOval(point.x, point.y, 5, 5);
        }
    }
}
