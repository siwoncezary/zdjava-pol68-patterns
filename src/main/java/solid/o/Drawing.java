package solid.o;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Shape {
    List<Shape> shapes = new ArrayList<>();
    public void add(Shape shape){
        shapes.add(shape);
    }


    @Override
    public void draw() {
        for(Shape shape: shapes){
            if (shape instanceof Rectangle){
                Rectangle r = (Rectangle) shape;
                System.out.println("Rysuje prostoka o bokach: " + r.getSideA() + " " + r.getSideB());
            }
            if (shape instanceof Circle){
                Circle c = (Circle) shape;
                System.out.println("Rysuje koło o środku: ");
            }
        }
    }
}
