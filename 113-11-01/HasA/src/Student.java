public class Student {
    private String studentID;
    private String name;

    public Student(){
        new Student("00000000", "未設定");
    }
    public  Student(String studentID){
        new Student(studentID, "未設定");
    }
    public  Student(String studentID, String name){
        this.studentID = studentID;
        this.name = name;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public String getName(){
        return this.name;
    }
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void printData(){
        System.out.printf("%s %s ",studentID,  name);
    }
}
