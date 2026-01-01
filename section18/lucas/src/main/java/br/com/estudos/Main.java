package br.com.estudos;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.estudos.model.Employees;
import br.com.estudos.services.CsvService;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter full file path: ");
            String path = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            List<Employees> listEmployees = new CsvService().csvRead(path);

            List<String> emailFilter = listEmployees.stream()
                .filter(e -> e.getSalary() >= salary)
                .sorted((e1, e2) -> e1.getEmail().toUpperCase().compareTo(e2.getEmail().toLowerCase()))
                .map(Employees::getEmail)
                .toList();
            
            System.out.printf("%nEmail of people whose salary  is more than %.2f%n", salary);
            emailFilter.forEach(System.out::println);

            double charFilter = listEmployees.stream()
                .filter(e -> e.getName().charAt(0) == 'M')
                .mapToDouble(Employees::getSalary)
                .sum();
            
            System.out.printf("%nSum of salary of people whose starts with 'M': %.2f", charFilter);

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}