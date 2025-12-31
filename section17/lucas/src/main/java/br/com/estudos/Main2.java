package br.com.estudos;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.com.estudos.model.Voter;
import br.com.estudos.services.CsvService;
import br.com.estudos.services.MapService;

public class Main2 {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter file full path: ");
            String path = sc.nextLine();

            List<Voter> service = new CsvService().csvRead(path);

            MapService resolved = new MapService(service);

            for (String voter : resolved.resolvedCount().keySet()) {
                System.out.println(voter + ": " + resolved.resolvedCount().get(voter));
            }

        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
