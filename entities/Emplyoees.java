package entities;

public class Emplyoees {
    
    private int id;
    private String name;
    private double salary;

    public Emplyoees (int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double porcent) {
        if (porcent > 0.0) salary += (porcent / 100 * salary);
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", id, name, salary);
    }

    public int getId() {
        return id;
    }
}
