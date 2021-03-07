package observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObserverDemo {
    public static void main(String[] args) {
        GameBoard game = new GameBoard();
        Player player1 = new Player("ADAM");
        Player player2 = new Player("EWA");
        game.addObserver(player1);
        game.addObserver(player2);
        game.makeMove(10, 11);
    }
}
