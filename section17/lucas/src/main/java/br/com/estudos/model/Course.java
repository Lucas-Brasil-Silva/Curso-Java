package section17.lucas.src.main.java.br.com.estudos.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String course;
    private List<Integer> listStudents = new ArrayList<>();

    public Course(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public List<Integer> getListStudents() {
        return listStudents;
    }
}
