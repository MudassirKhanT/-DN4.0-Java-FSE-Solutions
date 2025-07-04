package Exercise7_Observer;

public class MobileApp implements Observer {
    public void update(double price) {
        System.out.println("MobileApp - Stock price updated to $" + price);
    }
}
