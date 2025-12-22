import java.util.Scanner;
import java.util.Locale;

public class exercicio11 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for ( int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 0) System.out.println(vect[i]);
        }

    }
}
