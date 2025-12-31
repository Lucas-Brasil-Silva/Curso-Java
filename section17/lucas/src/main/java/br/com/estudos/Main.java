package br.com.estudos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import br.com.estudos.model.Course;

public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            List<Course> courses = new ArrayList<>();
            courses.add(new Course("Course A"));
            courses.add(new Course("Course B"));
            courses.add(new Course("Course C"));

            Set<Integer> students = new HashSet<>();

            for (Course course : courses) {
                System.out.print("How many students for" + course.getCourse() + "? ");
                int n = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < n; i++) {
                    Integer student = Integer.parseInt(sc.nextLine());
                    course.getListStudents().add(student);
                }
                students.addAll(course.getListStudents());
            }

            System.out.println("Total Students: " + students.size());
            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
}