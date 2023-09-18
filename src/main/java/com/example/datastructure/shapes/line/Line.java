package com.example.datastructure.shapes.line;

import com.example.datastructure.shapes.ShapesMethod;

public class Line extends javafx.scene.shape.Line implements ShapesMethod {


    public Line(double x1, double y1, double x2, double y2) {
        this.setStartX(x1);
        this.setStartY(y1);
        this.setEndX(x2);
        this.setEndY(y2);
        this.setStrokeWidth(50);

        this.setOnMouseClicked(mouseEvent ->
                System.out.println("Line was clicked")
        );
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
