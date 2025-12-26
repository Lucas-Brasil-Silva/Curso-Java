import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LerMatriz {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe o tamanho que a Matriz:\n");
            int m = Integer.parseInt(sc.nextLine());
            int n = Integer.parseInt(sc.nextLine());
            int matriz[][] = new int[m][n];

            System.out.println();
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matriz[i][j] = ThreadLocalRandom.current().nextInt(1, 20);
                }
            }

            for (int i = 0; i < matriz.length; i++) {
                String resultado = Arrays.stream(matriz[i])
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" - "));
                System.out.println(resultado);
            }

            System.out.println("Digite o numero que gostaria de consultar:");
            int consulta = Integer.parseInt(sc.nextLine());
            System.out.println();

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matriz[i][j] == consulta) {
                        System.out.printf("Position %d,%d:%n", i, j);
                        if ( j - 1 >= 0 ) System.out.printf("Left: %d%n", matriz[i][j - 1]);
                        if ( j + 1 <= n - 1 ) System.out.printf("Right: %d%n", matriz[i][j + 1]);
                        if ( i - 1 >= 0 ) System.out.printf("Up: %d%n", matriz[i - 1][j]);
                        if ( i + 1 <= m - 1 ) System.out.printf("Down: %d%n", matriz[i + 1][j]);
                        System.out.println();
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Digite um dado valido.");
        }

    }
}
