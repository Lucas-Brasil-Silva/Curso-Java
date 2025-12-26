package entities;

import java.time.LocalDate;

public class UserProduct extends Product{
    LocalDate manufacturedate;

    public UserProduct() {
        super();
    }

    public UserProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufacturedate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return String.format("%s (used) $ %.2f (Manufacture date: %s)", super.getName(), super.getPrice(), manufacturedate.toString());
    }
}
