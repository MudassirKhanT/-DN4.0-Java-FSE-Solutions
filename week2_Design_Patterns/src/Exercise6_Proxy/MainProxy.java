package Exercise6_Proxy;

public class MainProxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        image.display(); // loads & displays
        image.display(); // only displays (cached)
    }
}
