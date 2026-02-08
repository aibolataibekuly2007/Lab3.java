public class PushNotificationSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Push notification sent: " + message);
    }
}