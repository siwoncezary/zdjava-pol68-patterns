package observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        GameBoard game = new GameBoard();
        game.addObserver(m -> {
            System.out.println("Wykonano ruch + " + m);
        });

        game.makeMove(10, 11);

        List<String> cities = Arrays.asList("A","B","C");
        List<String> copy = new ArrayList<>(cities);
        copy.add("F");
    }
}
