package Exercise5_Decorator;

public class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
