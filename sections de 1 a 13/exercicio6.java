import java.util.Scanner;
import java.util.Locale;

public class exercicio6 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        double a, b, c;
        
        System.out.println("Digite os valdores de A, B e C:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();

        double triangulo = (a * c)/2; // (base × altura) / 2
        double circulo = 3.14159 * Math.pow(c, 2); // A = πr², onde 'A' é a área, 'π' (pi) é aproximadamente 3,14, e 'r' é o raio (distância do centro à borda) elevado ao quadrado
        double trapezio = ((a + b) * c) / 2; // Área = ((Base maior + Base menor) * Altura) / 2
        double quadrado = Math.pow(b, 2); // multiplicar a medida de um lado por ela mesma, ou seja, elevar o valor do lado ao quadrado (Lado x Lado ou L²)
        double retangulo = a * b; // multiplicar a medida da sua base pela medida da sua altura (ou comprimento pela largura)

        System.out.printf("TRIÂNGULO: %.3f\n", triangulo);
        System.out.printf("CIRCULO: %.3f\n", circulo);
        System.out.printf("TRAPÉZIO: %.3f\n", trapezio);
        System.out.printf("QUADRADO: %.3f\n", quadrado);
        System.out.printf("RETÂNGULO: %.3f\n", retangulo);

    }
}
