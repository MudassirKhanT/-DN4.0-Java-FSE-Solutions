package Exercise1_Inventory;

public class MainInventory {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        
        Product p1 = new Product(101, "Laptop", 10, 75000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        
        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.updateProduct(101, 8, 74000);
        manager.deleteProduct(102);

        manager.listProducts();
    }
}
