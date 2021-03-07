package decorator;

public class CenteredTextMessage implements Message{
    private final Message message;
    private final int width;

    public CenteredTextMessage(Message message, int width) {
        this.message = message;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String content() {
        String centeredMessage = message.content();
        return shiftCursor() + centeredMessage;
    }

    private String shiftCursor(){
        int len = (width - message.content().length()) / 2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            sb.append(" ");
        }
        return sb.toString();
    }

}
