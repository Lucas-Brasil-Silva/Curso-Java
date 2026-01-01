package br.com.estudos.model;

import com.opencsv.bean.CsvBindByName;

public class Employees {
    
    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Email")
    private String email;

    @CsvBindByName(column = "Salary")
    private Double salary;

    public Employees() {

    }

    public Double getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    
}
