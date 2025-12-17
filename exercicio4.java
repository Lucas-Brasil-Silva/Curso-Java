import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        int number;
        int hoursWorked;
        double salary;
        
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        hoursWorked = sc.nextInt();
        salary = sc.nextDouble();
        sc.close();

        double payment = hoursWorked * salary;

        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f", number, payment);

    }
}
