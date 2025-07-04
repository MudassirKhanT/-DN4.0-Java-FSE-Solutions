package Exercise3_Sorting;
import java.util.Arrays;

public class MainSorting {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 300.50),
            new Order(2, "Bob", 120.00),
            new Order(3, "Charlie", 450.75),
            new Order(4, "Dave", 200.00)
        };

        System.out.println("Before Bubble Sort:");
        Arrays.stream(orders).forEach(System.out::println);

        SortFunctions.bubbleSort(orders);
        System.out.println("\nAfter Bubble Sort:");
        Arrays.stream(orders).forEach(System.out::println);

        // Shuffle for quick sort example
        orders = new Order[] {
            new Order(1, "Alice", 300.50),
            new Order(2, "Bob", 120.00),
            new Order(3, "Charlie", 450.75),
            new Order(4, "Dave", 200.00)
        };

        SortFunctions.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nAfter Quick Sort:");
        Arrays.stream(orders).forEach(System.out::println);
    }
}
