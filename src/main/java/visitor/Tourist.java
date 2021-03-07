package visitor;

public class Tourist implements Visitor {
    int account = 100000;
    @Override
    public void visit(Museum museum) {
        final int price = 1000;
        museum.buyTicket(price);
        account -= price;
        museum.exhibitOne();
        museum.exhibitTow();
    }

    @Override
    public void visit(Taxi taxi) {
        taxi.pay(1200);
    }
}
