package artifactid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import artifactid.model.Product;
import artifactid.model.ProductReport;
import artifactid.service.csvService;

public class Main {
    public static void main(String[] args) {
        CsvService service = new CsvService();
        String path = "section15\\demo\\src\\main\\resources\\produtos.csv";
        String newPath = "section15\\demo\\src\\main\\resources\\out\\reportprodutos2.csv";

    try {

        System.out.println("Iniciando leitura do arquivo!");
        List<Product> listProducts = service.csvRead(path);
        
        System.out.println("Realizando os ajustes no arquivo!");
        service.csvUpdate(listProducts);

        List<ProductReport> listPR = new ArrayList<>();
        for (Product product : listProducts) {
            listPR.add(new ProductReport(product.getName(), product.getValor()));
        }

        System.out.println("Salvando arquivo!");
        service.csvWriterReport(newPath, listPR);

        System.out.println("Peocesso finalizado com sucesso!");

    } catch (IOException e) {
        System.out.println(e);;
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    }
}