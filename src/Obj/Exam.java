package Obj;

public class Exam {
    private String subjectName;
    private float exampoint;

         //Constructor
    public Exam() {

    }

    public Exam(String subjectName, float exampoint) {
        this.subjectName = subjectName;
        this.exampoint = exampoint;

    }


          //Getter & Setter
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public float getExampoint() {
        return exampoint;
    }

    public void setExampoint(float exampoint) {
        this.exampoint = exampoint;
    }


}
