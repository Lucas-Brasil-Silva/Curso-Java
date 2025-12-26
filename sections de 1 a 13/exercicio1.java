import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int valor1;
        int valor2;

        Scanner sc = new Scanner(System.in);

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        sc.close();
        
        System.out.printf("SOMA = %d", (valor1 + valor2));

    }
}
