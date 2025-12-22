import java.util.Scanner;
import java.util.Locale;

public class exercicio14 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros  voce vai digitar? ");
        int n = Integer.parseInt(sc.nextLine());
        int[] numeros = new int[n];
        int contador = 0;

        for ( int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        sc.close();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.printf("%s ", numeros[i]);
                contador ++;
            }
        }
        
        System.out.println("\nQUANTIDADE DE PARES = " + contador);
    }
}
