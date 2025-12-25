import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class newPurchase {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Client Data:");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Birth date (DD/MM/YYYY): ");
            LocalDate birthDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Client newClient = new Client(name, email, birthDate);
            Order newOrder = new Order(OrderStatus.PROCESSING);
            
            System.out.println("\nEnter order data:");
            System.out.println("Status: " + newOrder.getStatus());
            System.out.print("How many items to this order? ");
            int contagem = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < contagem; i++) {
                System.out.printf("%nEnter #%d item data:%n", i + 1);
                System.out.print("Product name: ");
                String product = sc.nextLine();
                System.out.print("Product price: ");
                double price = Double.parseDouble(sc.nextLine());
                System.out.print("Quantity: ");
                int quantity = Integer.parseInt(sc.nextLine());
                newOrder.additem(new OrderItem(quantity, new Product(product, price)));
                System.out.println();
            }

            System.out.println("ORDER SUMMARY:");
            System.out.println("Order moment: " + newOrder.getMoment());
            System.out.println("Order status: " + newOrder.getStatus());
            System.out.println("Client: " + newClient);
            System.out.println();
            System.out.println("Order items:");
            double priceTotal = 0.0;
            for (OrderItem orderItem : newOrder.getOrderItems()) {
                System.out.println(orderItem);
                priceTotal += orderItem.subTotal();
            }
            System.out.printf("Total price: $%.2f", priceTotal);

        } catch (NumberFormatException e) {
            System.err.println("Erro: Você digitou um caractere inválido. Use apenas números inteiros.");
        } catch (Exception e) {
            System.err.println("Erro inesperado:" + e.getMessage());
        }
    }
}
