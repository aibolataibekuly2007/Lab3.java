public class MainDIP {
    public static void main(String[] args) {
        NotificationServiceDIP notificationService = new NotificationServiceDIP();

        notificationService.addSender(new EmailSender());
        notificationService.addSender(new SmsSender());
        notificationService.addSender(new MessengerSender());

        notificationService.sendNotification("Hello, this is a notification!");

        notificationService.addSender(new PushNotificationSender());
        notificationService.sendNotification("New update available!");
    }
}