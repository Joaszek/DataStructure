package com.example.datastructure.shapes.rectangle;

import com.example.datastructure.shapes.ShapesMethod;
import javafx.scene.paint.Color;

public class Rectangle extends javafx.scene.shape.Rectangle implements ShapesMethod {

    public Rectangle(double x, double y, double width, double height) {
        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);

        this.setOnMouseClicked(event ->
                System.out.println("Rectangle has been clicked"));

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
