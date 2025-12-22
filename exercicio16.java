import java.util.Scanner;
import java.util.Locale;
import java.util.stream.IntStream;

public class exercicio16 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = Integer.parseInt(sc.nextLine());
        int[] vectA = new int[n];
        int[] vectB = new int[n];

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite os valores do vetor %c:\n", i == 0 ? 'A' : 'B');
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    vectA[j] = Integer.parseInt(sc.nextLine());
                } else {
                    vectB[j] = Integer.parseInt(sc.nextLine());
                }
            }
        }
        sc.close();

        int[] vectC = IntStream.range(0, n)
            .map(i -> vectA[i] + vectB[i])
            .toArray();
        
        System.out.println("VETOR RESULTANTE:");
        for (int i : vectC) {
            System.out.println(i);
        }
    }
}
