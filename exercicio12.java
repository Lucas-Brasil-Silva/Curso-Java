import java.util.Scanner;
import java.util.Locale;

public class exercicio12 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for ( int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        sc.close();

        double soma = 0.0;
        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
            soma += vect[i];
        }
        
        System.out.println();
        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", soma / vect.length);



    }
}
