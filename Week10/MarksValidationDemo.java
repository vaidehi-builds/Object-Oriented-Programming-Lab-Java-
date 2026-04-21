package Week10;
class Student{
    double calculateAvg(int totalMarks, int numOfSub){
        if(numOfSub==0) {throw new ArithmeticException("Numbe of subjects cannot be zero!");}
        return (double) totalMarks/numOfSub;
    }
}
public class MarksValidationDemo {
    public static void main(String[] args){
        Student s=new Student();
        try{
            double avg=s.calculateAvg(209, 3);
            System.out.println("Average: "+avg);
            avg=s.calculateAvg(207, 0);
            System.out.println("Average: "+avg);
        }catch(ArithmeticException e){
            System.out.println("Error! :"+e.getMessage());
        }
    }
}
