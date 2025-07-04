package Exercise4_Adapter;

public class MainAdapter {
    public static void main(String[] args) {
        PaymentProcessor processor = new StripeAdapter(new StripeGateway());
        processor.processPayment(250.0);
    }
}
