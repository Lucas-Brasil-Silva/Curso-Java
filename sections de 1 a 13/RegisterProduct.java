import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UserProduct;

public class RegisterProduct {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            List<Product> list = new ArrayList<>();

            System.out.print("Enter the number of products: ");
            Integer n = Integer.parseInt(sc.nextLine());
            for (int i = 1; i <= n; i++) {
                System.out.println("Product #" + i + " data:");
                System.out.print("Common, used or imported (c/u/i)? ");
                char category = sc.nextLine().charAt(0);
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                Double price = Double.parseDouble(sc.nextLine());
                Product newProduct = new Product();
                Product newImported = new ImportedProduct();
                Product newUser =  new UserProduct();
                
                switch (category) {
                    case 'i':
                        System.out.print("Customs fee: ");
                        Double customsFee = Double.parseDouble(sc.nextLine());
                        newImported = new ImportedProduct(name, price, customsFee);
                        list.add(newImported);
                        break;
                    case 'c':
                        newProduct = new Product(name, price);
                        list.add(newProduct);
                        break;
                    case 'u':
                        System.out.print("Manufacture date (DD/MM/YYYY): ");
                        LocalDate manufacturedate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                        newUser = new UserProduct(name, price, manufacturedate);
                        list.add(newUser);
                        break;
                    default:
                        System.out.println("Erro valor invalido. Digite um valor valido.");
                        break;
                }
            }

            System.out.println("PRICE TAGS:");
            for (Product product : list) {
                System.out.println(product.priceTag());
            }

        } catch (NumberFormatException e) {
            System.err.println("Erro valor invalido. Digite um valor valido!!");
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
        
    }
}
