package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Message textMessage = new TextMessage("Hello");
        System.out.println(textMessage.content());
        textMessage = new CenteredTextMessage(textMessage, 80);
        //TODO zdefiniować dekorator dodający gwiazdki przed za napisem z content
        System.out.println(textMessage.content());
        System.out.println(((CenteredTextMessage)textMessage).getWidth());
    }
}
