package br.com.estudos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import br.com.estudos.model.Contract;
import br.com.estudos.model.Installment;
import br.com.estudos.services.ContractService;
import br.com.estudos.services.PaypalService;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("Enter the contract details:");
            System.out.print("Number: ");
            Integer number = Integer.parseInt(sc.nextLine());
            System.out.print("Date (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Contract value: ");
            BigDecimal totalValue = new BigDecimal(sc.nextLine());
            System.out.print("Enter the number of installments: ");
            int months = Integer.parseInt(sc.nextLine());

            Contract newContract = new Contract(number, date, totalValue);
            ContractService service = new ContractService(new PaypalService());
            service.processContract(newContract, months);

            System.out.println("\nInstallments:");
            for (Installment installment : newContract.getListInstallments()) {
                System.out.println(installment);
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}