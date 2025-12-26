import java.util.Scanner;
import java.util.Locale;

public class exercicio13 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos pessoas serao digitadas? ");
        int n = Integer.parseInt(sc.nextLine());
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        double soma = 0.0;
        double contador = 0;

        for ( int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = Integer.parseInt(sc.nextLine());
            System.out.print("Altura: ");
            altura[i] = Double.parseDouble(sc.nextLine());
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            soma += altura[i];
            if (idade[i] < 16) contador ++;
        }

        System.out.printf("Altura média = %.2f\n", soma / n);
        System.out.printf("Pessoas com menos de 16 anos: %.1f", contador / (double) (n) * 100.00);
        System.out.println("%");
        for (int i = 0; i < n; i++) {
            if (idade[i] < 16) System.out.printf("%s\n", nome[i]);
        }
    }
}
