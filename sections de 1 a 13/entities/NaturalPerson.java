package entities;

public class NaturalPerson extends Person{
    private Double spentOnHealth;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, Double annualIncome, Double spentOnHealth) {
        super(name, annualIncome);
        this.spentOnHealth = spentOnHealth;
    }

    @Override
    public Double totalTaxes() {
        Double annualIncome = getAnnualIncome();

        if (annualIncome < 2000) {
            return (annualIncome * 0.15) - (spentOnHealth * 0.5);
        } else {
            return (annualIncome * 0.25) - (spentOnHealth * 0.5);
        }
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", super.getName(), totalTaxes());
    }
}
