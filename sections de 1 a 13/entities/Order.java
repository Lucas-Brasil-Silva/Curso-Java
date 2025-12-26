package entities;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(OrderStatus status) {
        this.status = status;
        moment = LocalDateTime.now();
    }

    public void additem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total() {
        double somaTotal = 0.0;

        for (OrderItem orderItem : orderItems) {
            somaTotal += orderItem.subTotal();
        }
        return somaTotal;
    }

    public OrderStatus getStatus() { 
        return status;
    }

    public String getMoment() {
        return moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
 