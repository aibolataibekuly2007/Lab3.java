public class MainSRP {
    public static void main(String[] args) {
        Order order = new Order("Laptop", 1, 1000.00);

        PriceCalculator calculator = new PriceCalculator();
        System.out.println("Total price: $" + calculator.calculateTotalPrice(order));

        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("Credit Card 1234");

        NotificationServiceSRP notificationService = new NotificationServiceSRP();
        notificationService.sendConfirmationEmail("customer@example.com");
    }
}