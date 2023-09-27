package com.example.datastructure.shapes.circle;

import com.example.datastructure.shapes.ShapesMethod;
import com.example.datastructure.shapes.rectangle.Rectangle;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends javafx.scene.shape.Circle implements ShapesMethod {



    public Circle() {

        this.setOnMouseClicked(event -> {

            System.out.println("You clicked on the circle!");
        });

        this.setFill(Color.BLACK);
    }

    @Override
    public void delete() {

    }

    @Override
    public Rectangle copy() {

        return null;
    }

    @Override
    public void paste() {

    }

    @Override
    public void move_backward() {

    }

    @Override
    public void move_forward() {

    }

    @Override
    public void draw(GraphicsContext gc, double startX, double endX, double startY, double endY) {
        double radius = Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
        gc.setFill(Color.RED);
        gc.fillOval(startX - radius, startY - radius, 2 * radius, 2 * radius);
    }
}

