import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class MediaAlunos {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Quantos alunos serao digitados? ");
            int n = Integer.parseInt(sc.nextLine());
            String[] alunos = new String[n];
            List<Integer> aprovados = new ArrayList<>();

            if (n == 0) {
                System.out.println("Não é possível calcular a média de 0 elementos.");
                return; 
            }
            
           for (int i = 0; i < alunos.length; i++) {
                System.out.printf("Digite nome, primeiro e segunda nota do %do aluno:\n", i + 1);
                alunos[i] = sc.nextLine();
                double nota1 = Double.parseDouble(sc.nextLine());
                double nota2 = Double.parseDouble(sc.nextLine());
                if ((nota1 + nota2) / 2.0 >= 6.0) {
                    aprovados.add(i);
                }
            }
            
            if (aprovados.size() > 0) {
                System.out.println("Alunos Aprovados:");
                for (Integer aprovado : aprovados) {
                    System.out.println(alunos[aprovado]);
                }
            } else {
                System.out.println("SEM APROVAÇÕES ESSE ANO!");
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Erro: Você digitou um caractere inválido. Use apenas números inteiros.");
        }
    }
}
