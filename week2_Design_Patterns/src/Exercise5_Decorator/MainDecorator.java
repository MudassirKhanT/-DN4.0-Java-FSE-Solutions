package Exercise5_Decorator;

public class MainDecorator {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(notifier);
        
        smsNotifier.send("Hello, customer!");
    }
}
