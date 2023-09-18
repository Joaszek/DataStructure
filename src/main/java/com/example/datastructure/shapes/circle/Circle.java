package com.example.datastructure.shapes.circle;

import com.example.datastructure.shapes.ShapesMethod;
import javafx.scene.paint.Color;

public class Circle extends javafx.scene.shape.Circle implements ShapesMethod {

    public Circle(double x, double y, double radius) {
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(radius);

        this.setOnMouseClicked(event -> {

            System.out.println("You clicked on the circle!");
        });

        this.setFill(Color.BLACK);
    }

    @Override
    public void delete() {

    }

    @Override
    public void copy() {

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
}

