package Exercise7_Observer;

public class MainObserver {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setPrice(100.0);
        market.setPrice(105.5);
    }
}
