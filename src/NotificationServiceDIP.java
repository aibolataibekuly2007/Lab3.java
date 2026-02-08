import java.util.ArrayList;
import java.util.List;

public class NotificationServiceDIP {
    private List<MessageSender> senders;

    public NotificationServiceDIP() {
        senders = new ArrayList<>();
    }

    public void addSender(MessageSender sender) {
        senders.add(sender);
    }

    public void sendNotification(String message) {
        for (MessageSender sender : senders) {
            sender.sendMessage(message);
        }
    }
}