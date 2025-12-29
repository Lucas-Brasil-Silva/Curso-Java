package artifactid.model;

import com.opencsv.bean.CsvBindByName;

public class Product {
    
    @CsvBindByName(column = "produto")
    private String name;
    
    @CsvBindByName(column = "valor")
    private Double valor;
   
    @CsvBindByName(column = "quantidade")
    private Integer quantidade;

    public Product() {

    }

    public String getName() {
        return name;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    
    public Double getValor() {
        return valor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }    
}
