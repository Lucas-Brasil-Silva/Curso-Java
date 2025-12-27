package section14.application;

import java.lang.classfile.attribute.SourceFileAttribute;
import java.util.Scanner;

import section14.model.entities.Account;
import section14.model.exceptions.DomainException;

public class Program {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = Integer.parseInt(sc.nextLine());
            System.out.print("Holder: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = Double.parseDouble(sc.nextLine());
            System.out.print("Withdraw limit: ");
            double limit = Double.parseDouble(sc.nextLine());
            
            Account newAccount = new Account(number, name, balance, limit);

            System.out.print("\nEnter amount for withdraw: ");
            double amount = Double.parseDouble(sc.nextLine());
            newAccount.withdraw(amount);
            System.out.println(newAccount);
            
            System.out.print("Enter the amount to be deposited: ");
            double _amount = Double.parseDouble(sc.nextLine());
            newAccount.deposit(_amount);
            System.out.println(newAccount);

        } catch (DomainException e) {
            System.err.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Err Global: " + e.getMessage());
        }
    }
}
