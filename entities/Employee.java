package entities;

public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax;
    public double increaseSalary;

    public double netSalary() {
        return (increaseSalary != 0) ? grossSalary + (grossSalary * (increaseSalary / 100)) - tax : grossSalary - tax;
    }

    public String toString() {
        return String.format("%s, $ %.2f", name, netSalary());
    }
}
