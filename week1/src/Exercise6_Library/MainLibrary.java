package Exercise6_Library;
import java.util.Arrays;

public class MainLibrary {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Programming", "Author A"),
            new Book(2, "Data Structures", "Author B"),
            new Book(3, "Algorithms", "Author C")
        };

        // Linear search
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase("Data Structures")) {
                System.out.println("Found by linear search: " + b);
            }
        }

        // Binary search (sorted by title)
        Arrays.sort(books, (a, b) -> a.getTitle().compareToIgnoreCase(b.getTitle()));
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = books[mid].getTitle().compareToIgnoreCase("Algorithms");
            if (cmp == 0) {
                System.out.println("Found by binary search: " + books[mid]);
                break;
            } else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
    }
}
