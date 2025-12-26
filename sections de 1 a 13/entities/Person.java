package entities;

public abstract class Person {
    private String name;
    private Double annualIncome;

    public Person() {

    }

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public abstract Double totalTaxes();
}
