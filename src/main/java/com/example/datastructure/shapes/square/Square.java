package com.example.datastructure.shapes.square;

import com.example.datastructure.shapes.ShapesMethod;
import javafx.scene.paint.Color;

public class Square extends javafx.scene.shape.Rectangle implements ShapesMethod {

    public Square(double x, double y, double length) {
        this.setWidth(length);
        this.setHeight(length);
        this.setX(x);
        this.setY(y);

        this.setOnMouseClicked(mouseEvent ->
                System.out.println("Square has been clicked")
        );

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
