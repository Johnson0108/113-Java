import java.util.Scanner;

public class GradeBook {
    private String courseName;
    private Student[] students;
    private double[] grades;
    private int numberOfStudents;

    public GradeBook(String courseName, Student[] students, int numberOfStudents) {
        this.courseName = courseName;
        this.students = students;
        this.numberOfStudents = numberOfStudents;
        this.grades = new double[numberOfStudents];
        displayMessage();
    }

    public void displayMessage() {
        System.out.println("歡迎使用%s成績系統\n" + this.courseName);
    }

    public void processStudentsGrades() {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入學生的成績:");
        for (int i = 0; i < this.numberOfStudents; i++) {
            students[i].printData();
            System.out.print("的成績:");
            grades[i] = input.nextDouble();
        }
    }
}





