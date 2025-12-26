package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Client {
    private String name;
    private String email;
    private LocalDate birthDate;

    private static DateTimeFormatter dateform = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Client(String name, String email, LocalDate birthgDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthgDate;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) - %s", name, birthDate.format(dateform), email);
    }
}
