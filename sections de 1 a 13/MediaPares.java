import java.util.Scanner;
import java.util.Locale;

public class MediaPares {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Quantos elementos vai ter o vetor? ");
            int n = Integer.parseInt(sc.nextLine());
            int[] numeros = new int[n];
            int soma = 0;
            int contador = 0;

            if (n == 0) {
                System.out.println("Não é possível calcular a média de 0 elementos.");
                return; 
            }
            
            for (int index : numeros) {
                System.out.print("Digite  um numero: ");
                numeros[index] = Integer.parseInt(sc.nextLine());
                if (numeros[index] % 2 == 0) {
                    soma += numeros[index];
                    contador ++;
                }
            }
            
            if (contador > 0) {
                System.out.printf("MEDIA DOS PARES = %d.0", soma / contador);
            } else {
                System.out.println("NENHUM NUMERO PAR");
            }

        } catch (NumberFormatException e) {
            System.out.println("Erro: Você digitou um caractere inválido. Use apenas números inteiros.");
        }
    }
}
