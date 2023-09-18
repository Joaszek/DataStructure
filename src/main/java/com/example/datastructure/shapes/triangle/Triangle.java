package com.example.datastructure.shapes.triangle;

import com.example.datastructure.shapes.ShapesMethod;
import javafx.scene.paint.Color;


public class Triangle extends javafx.scene.shape.Polygon implements ShapesMethod {

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.getPoints().addAll(new Double[]{
                x1, y1,
                x2, y2,
                x3, y3
        });

        this.setOnMouseClicked(event ->
                System.out.println("Triangle has been clicked"));

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
