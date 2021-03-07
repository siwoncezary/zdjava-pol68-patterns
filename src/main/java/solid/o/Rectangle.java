package solid.o;

public class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("Rysuje prostokąt");
    }

    public int getSideA(){
        return 5;
    }

    public int getSideB(){
        return 6;
    }
}
