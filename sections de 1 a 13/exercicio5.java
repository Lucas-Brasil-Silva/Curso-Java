import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class exercicio5 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        List<Double> produtc1 = new ArrayList<>();
        List<Double> produtc2 = new ArrayList<>();
               
        System.out.println("Digite os valores do produtc1 que deseja:");

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            produtc1.add(sc.nextDouble());
        }

        System.out.println("Digite os valores do produtc2 que deseja:");

        for (int i = 0; i < 3; i++) {
            produtc2.add(sc.nextDouble());
        }
        sc.close();

        double payment = produtc1.get(1) * produtc1.get(2) + produtc2.get(1) * produtc2.get(2);

        System.out.printf("AMOUNT TO PLAY: U$ %.2f", payment);

    }
}
