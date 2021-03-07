package visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        Museum museum = new Museum();
        Tourist tourist = new Tourist();
        Child child = new Child();

        museum.accept(tourist);
        museum.accept(child);
        System.out.println(museum.getAmount());
    }
}
