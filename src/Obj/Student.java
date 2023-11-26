package Obj;

public class Student {
    private String name,userName,password;
    private Exam exam;

            //Constructors
    public Student() {

    }
    public Student(String name, String userName, String password, Exam exam) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.exam = exam;
    }

          //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public float getExamPoint (){
        return exam.getExampoint();
    }
}



