import entities.Employee;
import java.util.Scanner;
import java.util.Locale;

public class exercicio8 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emplo = new Employee();

        System.out.println("Enter the employee's information: Name, Salary, and Taxes.");
        emplo.name = sc.nextLine();
        emplo.grossSalary = sc.nextDouble();
        emplo.tax = sc.nextDouble();
                
        System.out.printf("Employee: %s\n", emplo.toString());
        
        System.out.print("Which percentage to increase salary? ");
        emplo.increaseSalary = sc.nextDouble();
        System.out.printf("Updated data: %s\n", emplo.toString());
        sc.close();
        
    }

}
