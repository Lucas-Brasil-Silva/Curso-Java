package entities;

public class Product {

    private String name;
    private Double price;

    public Product () {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String priceTag() {
        return String.format("%s $ %.2f", name, price);
    }
}
