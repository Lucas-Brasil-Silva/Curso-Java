package entities;

public class ImportedProduct extends Product {
    private Double custemsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double custesFee) {
        super(name, price);
        this.custemsFee = custesFee;
    }

    public Double totalPrice() {
        return super.getPrice() + custemsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s $ %.2f (Customs fee: $ %.2f)", super.getName(), totalPrice(), custemsFee);
    }
}
