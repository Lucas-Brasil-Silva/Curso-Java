package artifactid.service;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import artifactid.model.Product;
import artifactid.model.ProductReport;

import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class CsvService {
    
    public List<Product> csvRead(String path) throws IOException {
        try (Reader reader = Files.newBufferedReader(Paths.get(path))) {
            return new CsvToBeanBuilder<Product>(reader)
                .withType(Product.class)
                .withSeparator(',')
                .build()
                .parse();
        }
    }

    public void csvUpdate(List<Product> products) {
        for (Product product : products) {
            product.setValor(product.getValor() * product.getQuantidade());
        }
    }

    public void csvWriterReport(String path, List<ProductReport> products) throws IOException {
        Path path2 = Paths.get(path);

        if (path2.getParent() != null) Files.createDirectories(path2.getParent());

        try (Writer writer = Files.newBufferedWriter(path2)) {
            StatefulBeanToCsv<ProductReport> beanToCsv = new StatefulBeanToCsvBuilder<ProductReport>(writer)
                .withSeparator(',')
                .withApplyQuotesToAll(false)
                .build();

            beanToCsv.write(products);
        } catch (Exception e) {
            throw new IOException("Erro ao Escrever no CSV: ", e);
        }
    }

}
