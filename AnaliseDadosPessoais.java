import java.util.Scanner;
import java.util.Locale;

public class AnaliseDadosPessoais {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Quantas pessoas voce vai digitar? ");
            int n = Integer.parseInt(sc.nextLine());
            char[] genero = new char[n];
            double[] altura = new double[n];

            if (n == 0) {
                System.out.println("Não é possível calcular a média de 0 elementos.");
                return; 
            }
            
            double menorAltura = 0.0;
            double maiorAltura = 0.0;
            int contMasculino = 0;
            double mediamulheres = 0.0;
            for (int i = 0; i < genero.length; i++) {
                System.out.printf("Altura da %da pessoa: ", i + 1);
                altura[i] = Double.parseDouble(sc.nextLine());
                System.out.printf("Gerero da %do pessoa: ", i + 1);
                genero[i] = sc.nextLine().charAt(0);
                
                if (genero[i] == 'M') {
                    contMasculino++;
                } else {
                    mediamulheres += altura[i];
                }

                if (i == 0) {
                    menorAltura = altura[i];
                    maiorAltura = altura[i];
                } else {
                    if (menorAltura > altura[i]) menorAltura = altura[i];
                    if (maiorAltura < altura[i]) maiorAltura = altura[i];
                }
            }
            
            System.out.printf("Menor altura = %.2f\n", menorAltura);
            System.out.printf("Maior altura = %.2f\n", maiorAltura);
            System.out.printf("Media das alturas das mulheres = %.2f\n", mediamulheres / (contMasculino - genero.length));
            System.out.println("Numero de homens = " + contMasculino);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Você digitou um caractere inválido. Use apenas números inteiros.");
        }
    }
}
