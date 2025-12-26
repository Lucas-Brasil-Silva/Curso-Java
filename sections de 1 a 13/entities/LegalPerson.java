package entities;

public class LegalPerson extends Person {
    private Integer employees;
    
    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, Double annualIncome, Integer employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    @Override
    public Double totalTaxes() {
        Double annualIncome = getAnnualIncome();
        
        if (employees < 10) {
            return annualIncome * 0.16;
        } else {
            return annualIncome * 0.14;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: $ %.2f", super.getName(), totalTaxes());
    }
}
