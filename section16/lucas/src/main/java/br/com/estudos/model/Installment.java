package br.com.estudos.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private LocalDate dueDate;
    private BigDecimal amount;

    public Installment() {

    }

    public Installment(LocalDate dueDate, BigDecimal amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f", dueDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(), amount);
    }
}
