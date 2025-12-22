import java.util.Scanner;
import java.util.Locale;

public class exercicio15 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros  voce vai digitar? ");
        int n = Integer.parseInt(sc.nextLine());
        int[] numeros = new int[n];
        double maiorNumero = 0;
        int index = 0;

        for ( int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
        sc.close();

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                index = i;
            }
        }
        
        System.out.println("MAIOR VALOR = " + maiorNumero);
        System.out.println("POSICAO DO MAIOR VALOR = " + index);
    }
}
