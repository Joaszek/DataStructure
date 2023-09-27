package com.example.datastructure.shapes.line;

import com.example.datastructure.shapes.ShapesMethod;
import com.example.datastructure.shapes.rectangle.Rectangle;
import javafx.scene.canvas.GraphicsContext;

public class Line extends javafx.scene.shape.Line implements ShapesMethod {


    public Line() {

        this.setStrokeWidth(50);

        this.setOnMouseClicked(mouseEvent ->
                System.out.println("Line was clicked")
        );
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
        //add drawing line
    }

}
