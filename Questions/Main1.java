package Questions;
interface PersonInfo{
    void displayInfo();
}
abstract class Person{
    String name;
    int ID;
    Person(String n, int id){
        name=n;
        ID=id;
    }
    abstract void showRole();
}
class Student extends Person implements PersonInfo{
    int year;
    String course;
    Student(String n, int id, int yr, String c){
        super(n,id);
        year=yr;
        course=c;
    }
    public void displayInfo(){
        System.out.println("Student Details: ");
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        showRole();
        System.out.println("Year: "+year);
        System.out.println("Course: "+course);
    }
    public void showRole(){
        System.out.println("Role: Student");
    }
}
class Faculty extends Person implements PersonInfo{
    String designation;
    String specialisation;
    Faculty(String n, int id, String d, String s){
        super(n,id);
        designation=d;
        specialisation=s;
    }
    public void displayInfo(){
        System.out.println("Faculty Details: ");
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        showRole();
        System.out.println("Designation: "+designation);
        System.out.println("Specialisation: "+specialisation);
    }
    public void showRole(){
        System.out.println("Role: Faculty");
    }
}
class Department{
    String departmentName;
    int sc;
    int fc;
    Student[] student=new Student[4];
    Faculty[] faculty=new Faculty[2];
    Department(String dn){departmentName=dn;}
    void addStudent(Student st){
        if(sc<student.length){
            student[sc++]=st;
        }
        else{
            System.out.println("Max student capacity Reached!");
        }
    }
    void addFaculty(Faculty fa){
        if(fc<faculty.length){
            faculty[fc++]=fa;
        }else{
            System.out.println("Max Faculty capacity reached!");
        }
    }
    void displayDepartmentDetails(){
        System.out.println("DEPARTMENT DETAILS");
        System.out.println("Name: "+departmentName);
        for(int i=0;i<sc;i++){
            student[i].displayInfo();
            System.out.println();
        }
        for(int i=0;i<fc;i++){
            faculty[i].displayInfo();
            System.out.println();
        }
    }
}
public class Main1 {
    public static void main(String[] args){
        Student s1=new Student("A", 1234, 2025, "CSE");
        Student s2=new Student("B", 1235, 2025, "CSE");
        Student s3=new Student("C", 1236, 2025, "CSE");
        Student s4=new Student("D", 1237, 2025, "CSE");
        Student s5=new Student("E", 1238, 2025, "CSE");
        Faculty f1=new Faculty("P.A", 2134, "Associate Prof", "AI/ML");
        Faculty f2=new Faculty("P.B", 2135, "Associate Prof", "Quant");
        Department d=new Department("CS");
        d.addStudent(s1);
        d.addStudent(s2);
        d.addStudent(s3);
        d.addStudent(s4);
        d.addStudent(s5);
        d.addFaculty(f1);
        d.addFaculty(f2);
        d.displayDepartmentDetails();

    }
}
