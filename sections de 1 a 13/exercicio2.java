import java.util.Scanner;
import java.util.Locale;

public class exercicio2 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        double area;
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        area = sc.nextDouble();
        sc.close();

        double resultado = pi*Math.pow(area,2);

        System.out.printf("SOMA = %.4f", resultado);

    }
}
