import java.util.Scanner;
import java.util.Locale;

public class AnaliseIdade {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Quantas pessoas voce vai digitar? ");
            int n = Integer.parseInt(sc.nextLine());
            String[] nome = new String[n];
            int[] idade = new int[n];

            if (n == 0) {
                System.out.println("Não é possível calcular a média de 0 elementos.");
                return; 
            }
            
            int comprarador = 0;
            int maisVelho = 0;
            for (int index = 0; index < nome.length; index++) {
                System.out.printf("Dados da %da pessoa:\n", index + 1);
                System.out.print("Nome: ");
                nome[index] = sc.nextLine();
                System.out.print("Idade: ");
                idade[index] = Integer.parseInt(sc.nextLine());
                
                if (idade[index] > comprarador) {
                    comprarador = idade[index];
                    maisVelho = index;
                }
            }
            
            System.out.println("PESSOA MAIS VELHA: " + nome[maisVelho]);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Você digitou um caractere inválido. Use apenas números inteiros.");
        }
    }
}
