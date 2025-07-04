package Exercise4_Adapter;

public class StripeGateway {
    public void makeStripePayment(double amount) {
        System.out.println("Processed payment of $" + amount + " via Stripe.");
    }
}
