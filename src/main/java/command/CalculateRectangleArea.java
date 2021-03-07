package command;

public class CalculateRectangleArea implements Command{
    final ReadDouble sideA;
    final ReadDouble sideB;
    double area;
    public CalculateRectangleArea(ReadDouble sideA, ReadDouble sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void execute() {
        area = sideA.getValue() * sideB.getValue();
    }

    public double getArea() {
        return area;
    }
}
