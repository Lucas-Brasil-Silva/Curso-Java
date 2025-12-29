package artifactid.model;

import com.opencsv.bean.CsvBindByName;

public class ProductReport {
    
    @CsvBindByName(column = "produto")
    private String name;
    
    @CsvBindByName(column = "valor")
    private Double valor;

    public ProductReport() {

    }

    public ProductReport(String name, Double valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }
    
    public Double getValor() {
        return valor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }    
}
