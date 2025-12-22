import java.util.Scanner;
import java.util.Locale;

public class exercicio17 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter cada vetor? ");
        int n = Integer.parseInt(sc.nextLine());
        double[] notas = new double[n];
        double soma = 0.0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite um numero: ");
            notas[i] = Double.parseDouble(sc.nextLine());
            soma += notas[i];
        }
        sc.close();

        double avg = soma / n;
        System.out.println("MEDIA DO VETOR = " + avg);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (double i : notas) {
            if (i < avg) System.out.println(i);
        }
    }
}
