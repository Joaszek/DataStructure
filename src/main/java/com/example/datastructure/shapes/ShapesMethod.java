package com.example.datastructure.shapes;

import com.example.datastructure.shapes.rectangle.Rectangle;
import javafx.scene.canvas.GraphicsContext;

public interface ShapesMethod {
    void delete();

    Rectangle copy();
    void paste();
    void move_backward();

    void move_forward();
    void draw(GraphicsContext gc, double startX, double endX, double startY, double endY);
}
