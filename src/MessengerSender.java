public class MessengerSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Messenger message sent: " + message);
    }
}