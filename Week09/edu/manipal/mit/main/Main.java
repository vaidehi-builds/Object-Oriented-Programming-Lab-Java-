package Week09.edu.manipal.mit.main;
import Week09.edu.manipal.mit.course.Course;
import Week09.edu.manipal.mit.student.Student;
import Week09.edu.manipal.mit.registration.Registration;
public class Main {
    public static void main(String[] args){
        Student s=new Student("Aviral",123,"Mathematics",9.5);
        Course c=new Course("MnC","Prof.",160);
        Registration r = new Registration(s,c);
        r.registerStudent();
    }
}
