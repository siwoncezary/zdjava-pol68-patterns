package solid.o;

import java.util.ArrayList;
import java.util.List;

public class OpenCloseDrawing extends Shape {
    List<Shape> shapes = new ArrayList<>();
    public void add(Shape shape){
        shapes.add(shape);
    }

    @Override
    public void draw() {
        shapes.forEach(Shape::draw);
    }
}
