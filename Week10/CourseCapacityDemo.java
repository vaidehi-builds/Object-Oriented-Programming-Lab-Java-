package Week10;
class CourseFullException extends Exception{
    CourseFullException(String m){
        super(m);
    }
}
class Course{
    private String courseName;
    private int capacity;
    private int enrolledStudents=0;
    Course(String cn,int c){
        this.courseName=cn;
        this.capacity=c;
    }
    void enrollStudent() throws CourseFullException{
        if(enrolledStudents>=capacity){
            throw new CourseFullException("Course Full!");
        }
        enrolledStudents++;
        System.out.println("Student Enrolled in "+ courseName +"! Total: "+ enrolledStudents);
    }
}
public class CourseCapacityDemo {
    public static void main(String[] args){
        Course c= new Course("JAVA",2);
        try{
            c.enrollStudent();
            c.enrollStudent();
            c.enrollStudent();
        }catch(CourseFullException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
