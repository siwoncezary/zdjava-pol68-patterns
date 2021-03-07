package visitor;

public class Taxi implements Visited{
    int amount;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void pay(int price){
        amount += price;
    }

    public int getAmount() {
        return amount;
    }
}
