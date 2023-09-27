package com.example.datastructure.shapes.square;

import com.example.datastructure.shapes.ShapesMethod;
import com.example.datastructure.shapes.rectangle.Rectangle;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends javafx.scene.shape.Rectangle implements ShapesMethod {

    public Square() {


        this.setOnMouseClicked(mouseEvent ->
                System.out.println("Square has been clicked")
        );

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
        gc.setFill(Color.BLUE);
        gc.fillRect(startX, startY, endX, endY);
    }
}
