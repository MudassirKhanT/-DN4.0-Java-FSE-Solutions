package Exercise7_Observer;

public interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}
