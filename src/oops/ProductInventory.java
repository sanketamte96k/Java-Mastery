package oops;

public class ProductInventory {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 101, 50000, 10);

        p1.displayInfo();

        // Add stock
        p1.addStock(5);

        // Sell product
        p1.sellProduct(3);

        // Try to sell more than available stock
        p1.sellProduct(20);

        // Try invalid quantity
        p1.addStock(-5);
        p1.sellProduct(-2);

        // Total inventory value
        System.out.println("Total Value = " + p1.getTotalValue());

        p1.displayInfo();
    }
}

class Product {

    private String productName;
    private int productID;
    private double price;
    private int quantity;

    // Default constructor
    Product() {
        this("unknown", 0);
    }

    // Constructor with name and ID
    Product(String productName, int productID) {
        this(productName, productID, 0, 0);
    }

    // Full constructor
    Product(String productName, int productID, double price, int quantity) {

        this.productName = productName;
        this.productID = productID;

        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price, setting to 0");
            this.price = 0;
        }

        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Invalid quantity, setting to 0");
            this.quantity = 0;
        }
    }

    void displayInfo() {
        System.out.println("Product Name = " + productName);
        System.out.println("Product ID = " + productID);
        System.out.println("Price = " + price);
        System.out.println("Quantity = " + quantity);
    }

    // Add stock
    void addStock(int quantity) {

        if (quantity > 0) {
            this.quantity += quantity;
            System.out.println("Stock successfully added");
        } else {
            System.out.println("Invalid quantity");
        }
    }

    // Sell product
    void sellProduct(int quantity) {

        if (quantity <= 0) {
            System.out.println("Invalid quantity");

        } else if (quantity > this.quantity) {
            System.out.println("Not enough stock");

        } else {
            this.quantity -= quantity;
            System.out.println("Sold = " + quantity);
        }
    }

    // Calculate total inventory value
    double getTotalValue() {
        return price * quantity;
    }
}