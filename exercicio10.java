import java.util.Scanner;
import java.util.Locale;
import entities.BankAccount;

public class exercicio10 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the required information to create a bank account.");
        System.out.print("Enter account number: ");
        int account = Integer.parseInt(sc.nextLine());
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char valueInitial = sc.next().charAt(0);
        double balance = 0.0;
        if (valueInitial == "y".charAt(0)) {
            System.out.print("Enter initial deposit value: ");
            balance = sc.nextDouble();
        }
        
        BankAccount bank = new BankAccount(account, holder, balance);

        System.out.println("\nAccount data:\n" + bank);

        System.out.print("Enter a deposit value: ");
        System.out.println(bank.deposit(sc.nextDouble()));

        System.out.print("Enter a Withdraw value: ");
        System.out.println(bank.sake(sc.nextDouble()));
        sc.nextLine();

        System.out.print("Inform the new account holder: ");
        bank.setHolder(sc.nextLine());
        sc.close();

        System.out.println(bank);
    }
}
