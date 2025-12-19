package entities;

public class Student {
    
    public String name;
    public double firstSemester, secondSemester, thirdSemester;
    public double totalGrades;
    public double approvalCriteria = 60.00;


    public boolean checkApproval() {
        return (totalGrades >= approvalCriteria) ? true : false;
    }

    public double missingApproval() {
        return approvalCriteria - totalGrades;
    }

    public String toString() {
        if (checkApproval()) {
            return String.format("%s\nFINAL GRADE = %.2f\nPASS", name, totalGrades);
        }
        return String.format("%s\nFINAL GRADE = %.2f\nFAILED\nMISSING %.2f POINTS", name, totalGrades, missingApproval());
    }
}
