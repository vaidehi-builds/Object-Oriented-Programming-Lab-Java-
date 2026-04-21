package Week10;
class Student{
    private String name;
    private int age;
    void registerStudent(String name, int age){
        if(age<18 || age>60){
            throw new IllegalArgumentException("Age must be between 18 and 60");
        }
        this.name=name;
        this.age=age;
        System.out.println("Student registered successfully!"+this.name+" ,Age: "+this.age);
    }
}
public class StudentAgeValidationDemo {
    public static void main(String[] args){
        Student s=new Student();
        try{
            s.registerStudent("A", 24);
            s.registerStudent("B", 16);
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
