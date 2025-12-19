import java.util.Scanner;
import entities.Rectangle;
import java.util.Locale;

public class exercicio7 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and heigth:");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        sc.close();

        System.out.printf("AREA = %.2f\n", Rectangle.area(width, height));
        System.out.printf("PERIMETER = %.2f\n", Rectangle.perimeter(width, height));
        System.out.printf("DIAGONAL = %.2f\n", Rectangle.diagonal(width, height));

    }
}
