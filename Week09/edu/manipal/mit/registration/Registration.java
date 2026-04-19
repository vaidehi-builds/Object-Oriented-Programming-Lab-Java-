package Week09.edu.manipal.mit.registration;
import Week09.edu.manipal.mit.course.Course;
import Week09.edu.manipal.mit.student.Student;
public class Registration {
   private Student student;
   private Course course;
   public Registration(Student s, Course c){
    student=s;
    course=c;
   }
   public void registerStudent(){
    System.out.println("Student Registered Successfully!");
    System.out.println("Student Name: "+student.getName());
    System.out.println("Student Roll Number: "+student.getRoll());
    System.out.println("Course Name: "+course.getcourseName());
   }
}
