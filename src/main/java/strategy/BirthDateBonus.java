package strategy;

import java.time.LocalDate;

public class BirthDateBonus implements PriceBonus{
    final static int BONUS = 5;
    final LocalDate today;
    final LocalDate birth;

    public BirthDateBonus(LocalDate today, LocalDate birth) {
        this.today = today;
        this.birth = birth;
    }

    @Override
    public Integer doOperation(Integer price) {
        if (today.getMonthValue() == birth.getMonthValue() && today.getDayOfMonth() == birth.getDayOfMonth()){
            return price - (int)(price * 5 / 100.0);
        }
         else {
            return price;
        }
    }
}
