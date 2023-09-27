package com.example.datastructure.shapes.triangle;

import com.example.datastructure.shapes.ShapesMethod;
import com.example.datastructure.shapes.rectangle.Rectangle;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Triangle extends javafx.scene.shape.Polygon implements ShapesMethod {

    public Triangle() {

        this.setOnMouseClicked(event ->
                System.out.println("Triangle has been clicked"));

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
        gc.setFill(Color.GREEN);
        gc.fillPolygon(new double[]{startX, endX, (startX + endX) / 2},
                new double[]{endY, endY, startY}, 3);
    }
}
