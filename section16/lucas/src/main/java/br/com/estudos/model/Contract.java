package br.com.estudos.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate date;
    private BigDecimal totalValue;

    private List<Installment> listInstallments = new ArrayList<>();

    public Contract() {

    }

    public Contract(Integer number, LocalDate date, BigDecimal totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    public Integer getNumber() {
        return number;
    }

    public LocalDate getDate() {
        return date;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public List<Installment> getListInstallments() {
        return listInstallments;
    }
}
