package br.com.estudos.services;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;

import br.com.estudos.model.Voter;

public class CsvService {
    
    public List<Voter> csvRead(String path) throws IOException {
        try (Reader reader = Files.newBufferedReader(Paths.get(path))) {
            return new CsvToBeanBuilder<Voter>(reader)
                .withType(Voter.class)
                .withSeparator(',')
                .build()
                .parse();
        }
    }
}
