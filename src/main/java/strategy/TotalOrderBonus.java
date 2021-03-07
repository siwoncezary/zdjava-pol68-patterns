package strategy;

public class TotalOrderBonus implements PriceBonus{
    final int totalOrderPrice;

    public TotalOrderBonus(int totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    @Override
    public Integer doOperation(Integer price) {
        if (totalOrderPrice > 100_000){
            return (int)(price * 0.9);
        } else {
            return (int)(price * 0.99);
        }
    }
}
