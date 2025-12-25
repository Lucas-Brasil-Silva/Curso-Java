import java.util.Scanner;
import java.util.Locale;
import entities.Emplyoees;

public class EmployeeSalary {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("How many emplotees will be registered? ");
            int n = Integer.parseInt(sc.nextLine());
            Emplyoees[] func = new Emplyoees[n];

            for (int i = 0; i < n; i++) {
                System.out.printf("Employee #%d:%n", i + 1);
                System.out.print("Id: ");
                int id = Integer.parseInt(sc.nextLine());
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Salary: ");
                double salary = Double.parseDouble(sc.nextLine());
                func[i] = new Emplyoees(id, name, salary);
            }

            System.out.print("%nEnter the employee id that will have salary increase: ");
            int idConsulta = Integer.parseInt(sc.nextLine());
            int cont = 0;
            for (Emplyoees dado : func) {
                if (dado.getId() == idConsulta) {
                    System.out.print("Enter the percentage: ");
                    dado.increaseSalary(Double.parseDouble(sc.nextLine()));
                    cont++;
                }
            }

            if (cont == 0) System.out.println("%nId invalido ou não existe.");

            System.out.println("%nList of employees:");
            for (Emplyoees dado : func) {
                System.out.println(dado);
            }

        } catch (Exception e) {
            System.out.println("Erro: Você digitou um caractere inválido.");
        }
    }
}
