package entities;

import entities.Product;

public class OrderItem {
    private int quantity;
    private Product product;
    
    
    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public double subTotal() {
        double productPrice = product.getPrice();
        return quantity * productPrice;
    }

    @Override
    public String toString() {
        String productName = product.getName();
        double productPrice = product.getPrice();

        return String.format("%s, $%.2f, Quantity: %d, Subtotal: $%.2f",productName, productPrice, quantity, subTotal());
    }
}
