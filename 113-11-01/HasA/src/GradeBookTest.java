public class GradeBookTest {
    public static void main(String[] args){
        final int NUMBER_OF_STUDENTS = 3;
        Student[] students = new Student[3];
        students[0] = new Student("A111222020", "姜睿森");
        students[1] = new Student("A111222021", "張逸安");
        students[2] = new Student("A111222001", "陳楷運");
        GradeBook gradeBook = new GradeBook("Java程式設計", students,NUMBER_OF_STUDENTS);
        gradeBook.processStudentsGrades();
        gradeBook.displayGradeReport();
    }
}
