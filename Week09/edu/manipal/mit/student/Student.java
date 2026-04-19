package Week09.edu.manipal.mit.student;
public class Student{
    private String name;
    private int rollNumber;
    protected String department;
    public double gpa;
    public Student(String n, int r, String d, double g){
        name=n;
        rollNumber=r;
        department=d;
        gpa=g;
    }
    public String getName(){return name;}
    public int getRoll(){return rollNumber;}
}
