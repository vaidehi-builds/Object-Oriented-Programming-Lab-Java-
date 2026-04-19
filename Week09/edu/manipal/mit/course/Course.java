package Week09.edu.manipal.mit.course;

public class Course {
    private String courseName;
    protected String instructor;
    public int credits;
    public Course(String c, String i, int cr){
        courseName=c;
        instructor=i;
        credits=cr;
    }
    public String getcourseName(){return courseName;}
}
