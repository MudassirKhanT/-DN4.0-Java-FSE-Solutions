package Exercise8_Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.pay(120.0);

        context.setStrategy(new PayPalPayment());
        context.pay(250.0);
    }
}
