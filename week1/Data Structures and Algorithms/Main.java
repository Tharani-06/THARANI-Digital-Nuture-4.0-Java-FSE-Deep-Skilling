public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        Product p1 = new Product(101, "Laptop", 10, 55000);
        Product p2 = new Product(102, "Monitor", 20, 8000);

        inv.addProduct(p1);
        inv.addProduct(p2);

        inv.updateProduct(101, 15, 54000);
        inv.displayAll();

        inv.deleteProduct(102);
        inv.displayAll();
    }
}
