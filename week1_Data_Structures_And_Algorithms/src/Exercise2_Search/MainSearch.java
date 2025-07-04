package Exercise2_Search;
import java.util.Arrays;

public class MainSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Mouse", "Electronics"),
            new Product(3, "Shirt", "Apparel"),
            new Product(4, "Table", "Furniture")
        };

        // Sort for binary search
        Arrays.sort(products, (a, b) -> a.getProductName().compareToIgnoreCase(b.getProductName()));

        Product result1 = SearchFunctions.linearSearch(products, "Shirt");
        Product result2 = SearchFunctions.binarySearch(products, "Mouse");

        System.out.println("Linear Search result: " + result1);
        System.out.println("Binary Search result: " + result2);
    }
}
