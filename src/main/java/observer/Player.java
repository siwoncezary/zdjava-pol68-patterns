package observer;

public class Player implements Observer<String>{
    private final String name;

    public Player(String name) {
        this.name = name;
    }


    @Override
    public void update(String message) {
        //logika związana z grą, opracowanie ruchu przez gracza
        System.out.println("Player "+ name +" - Wykonano ruch: " + message);
    }
}
