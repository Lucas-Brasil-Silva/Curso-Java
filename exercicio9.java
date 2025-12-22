import entities.Student;
import java.util.Scanner;
import java.util.Locale;

public class exercicio9 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student stud = new Student();

        System.out.println("Enter the student's name along with the 3 grades for each semester:");
        stud.name = sc.nextLine();
        stud.firstSemester = sc.nextDouble();
        stud.secondSemester = sc.nextDouble();
        stud.thirdSemester = sc.nextDouble();
        stud.totalGrades = stud.firstSemester + stud.secondSemester + stud.thirdSemester;
        sc.close();

        System.out.println(stud);

    }
}