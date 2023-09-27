package com.example.datastructure.shapes.rectangle;

import com.example.datastructure.shapes.ShapesMethod;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends javafx.scene.shape.Rectangle implements ShapesMethod {

    public Rectangle() {

        this.setOnMouseClicked(event ->
                System.out.println("Rectangle has been clicked"));

        this.setFill(Color.BLACK);
    }

    @Override
    public void delete() {

    }

    @Override
    public Rectangle copy() {

        return this;
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
        gc.setFill(Color.BLUE);
        gc.fillRect(startX, startY, endX - startX, endY - startY);
    }
}
