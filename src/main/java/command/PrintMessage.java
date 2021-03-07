package command;

import java.util.function.Supplier;

public class PrintMessage implements Command{
    final Supplier<String> message;

    public PrintMessage(Supplier<String> message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message.get());
    }
}
