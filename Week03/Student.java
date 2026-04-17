package Week03;
import java.util.Scanner;
public class Student {
    String sname;
    int[] marks=new int[3];
    int total,m1,m2,m3;
    double avg;

    void assign(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        sname=sc.nextLine();
        System.out.println("Enter marks in 3 subjects: ");
        for(int i=0;i<3;i++){
            System.out.print("\nMarks of Subject "+(i+1)+" :");
            marks[i]=sc.nextInt();
        }
        sc.close();
    }
    void display(){
        System.out.println("STUDENT DETAILS");
        System.out.print("Student name: "+sname);
        System.out.print("\nMarks: ");
        for(int i=0;i<3;i++) System.out.print(marks[i]+" ");
        System.out.print("\nTotal: "+ total);
        System.out.print("\nAverage: "+avg);
        }
    void compute(){
        for(int i=0;i<3;i++) total+=marks[i];
        avg=total/3.0;
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.assign();
        s1.compute();
        s1.display();
    }
}
