import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> inventoryMap = new HashMap<>();

    public void addProduct(Product product) {
        inventoryMap.put(product.getProductId(), product);
    }

    public void updateProduct(int productId , int quantity , double price){
        Product product = inventoryMap.get(productId);
        if (product!=null){
            product.setQuantity(quantity);
            product.setPrice(price);
        }
    }

    public void deleteProduct(int productId){
        inventoryMap.remove(productId);
    }

    public void displayAll() {
        for (Product p : inventoryMap.values()) {
            System.out.println("ID: " + p.getProductId() + ", Name: " + p.getProductName() + ", Qty: " + p.getQuantity() + ", Price: " + p.getPrice());
        }
    }
}
