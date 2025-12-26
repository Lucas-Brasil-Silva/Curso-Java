import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class TaxPaid {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of tax payers: ");
            Integer n = Integer.parseInt(sc.nextLine());

            List<Person> listPerson = new ArrayList<>();

            for (int i = 1; i <= n; i++) {
                System.out.println("Tax payer #" + i + " data: ");
                System.out.print("Individual or company (i/c)? ");
                char cond = sc.nextLine().charAt(0);
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                Double annualIncome = Double.parseDouble(sc.nextLine());

                switch (cond) {
                    case 'i':
                        System.out.print("Health expenditures: ");
                        Double spentOnHealth = Double.parseDouble(sc.nextLine());
                        listPerson.add(new NaturalPerson(name, annualIncome, spentOnHealth));
                        break;

                    case 'c':
                        System.out.print("Number of employees: ");
                        Integer employees = Integer.parseInt(sc.nextLine());
                        listPerson.add(new LegalPerson(name, annualIncome, employees));
                        break;

                    default:
                        System.err.println("Erro: Digite um valor valido.");
                        break;
                }
            }

            System.out.println("\nTAXES PAID:");
            for (Person person : listPerson) {
                System.out.println(person);
            }

            System.out.println("\nTOTAL TAXES: $ %2.f" + listPerson.stream().mapToDouble(Person::totalTaxes).sum());

        } catch (NumberFormatException e) {
            System.err.println("Erro dado invalido. Digite uma valor valido.");
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
    
    

}