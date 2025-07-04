package Exercise1_Inventory;
import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Added: " + product);
    }

    public void updateProduct(int productId, int quantity, double price) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setQuantity(quantity);
            p.setPrice(price);
            System.out.println("Updated: " + p);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.remove(productId) != null) {
            System.out.println("Deleted product with id: " + productId);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void listProducts() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
