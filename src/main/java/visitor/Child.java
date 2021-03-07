package visitor;

public class Child implements Visitor{
    @Override
    public void visit(Museum museum) {
        museum.exhibitTow();
    }

    @Override
    public void visit(Taxi taxi) {
    }
}
