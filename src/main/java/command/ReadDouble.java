package command;
import java.util.Scanner;

public class ReadDouble implements Command{
    final Scanner input;
    double value;

    public ReadDouble(Scanner input) {
        this.input = input;
    }

    @Override
    public void execute() {
        value = input.nextDouble();
    }

    public double getValue() {
        return value;
    }
}
