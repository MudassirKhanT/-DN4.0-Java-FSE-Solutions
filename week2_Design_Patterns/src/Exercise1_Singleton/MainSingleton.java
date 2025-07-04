package Exercise1_Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second message.");

        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
