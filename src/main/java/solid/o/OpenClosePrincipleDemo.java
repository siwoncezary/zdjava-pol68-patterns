package solid.o;

public class OpenClosePrincipleDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        //Ta klasa jest zamknięta na rozszerzenia a otwarta na modyfikacje
        Drawing drawing = new Drawing();
        drawing.add(r);
        drawing.add(c);
        //tego typu kształy klasa Drawing nie rozumie, więc go nie wyświetli
        drawing.add(new Section());
        //żeby wyświetlić nowy kształt należy zmodyfikowac klasę Drawing!!!
        drawing.draw();
        OpenCloseDrawing superDrawing = new OpenCloseDrawing();
        superDrawing.add(r);
        superDrawing.add(c);
        superDrawing.add(new Section());
        superDrawing.draw();

    }
}
