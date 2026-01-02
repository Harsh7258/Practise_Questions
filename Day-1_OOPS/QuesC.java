// QuesC.java
// Demonstration of Template Method Design Pattern

abstract class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Common behavior: Every product has a name and price
    void displayBaseDetails() {
        System.out.println("Product: " + name + " | Price: " + price);
    }

    // Abstract behavior: Every product must define HOW it is delivered
    abstract void deliver();
}

// Physical Product implementation
class PhysicalProduct extends Product {
    private double weight;

    PhysicalProduct(String name, double price, double weight) {
        super(name, price);
        this.weight = weight;
    }

    @Override
    void deliver() {
        System.out.println("Shipping by truck to your address. Weight: " + weight + "kg");
    }
}

// Digital Product implementation
class DigitalProduct extends Product {
    DigitalProduct(String name, double price) {
        super(name, price);
    }

    @Override
    void deliver() {
        System.out.println("Sending download link to your email.");
    }
}
