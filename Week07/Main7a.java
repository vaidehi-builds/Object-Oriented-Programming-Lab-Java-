package Week07;
class Student{
    String sname;
    int roll;
    int[] marks;
    double total,average;

    Student(String sname, int roll, int[] marks){
        this.sname=sname;
        this.roll=roll;
        this.marks=marks.clone();
    }
    void compute(){
        total=0;
        for(int m:marks){total+=m;}
        average=total/marks.length;
    }
    void display(){
        System.out.println("Name: "+sname);
        System.out.println("Roll: "+roll);
        System.out.println("Total: "+total);
        System.out.println("Average: "+average);
    }
}
class ScienceStudent extends Student{
    int practicalMarks;
    ScienceStudent(String sname,int roll,int[] marks,int pm){
        super(sname,roll,marks);
        practicalMarks=pm;
    }
    @Override
    void compute(){
        super.compute();
        total+=practicalMarks;
        average=total/(marks.length+1);
    }
    void displayPracticalMarks(){
        System.out.println("Practical Marks: "+practicalMarks);
    }
    @Override
    void display(){
        super.display();
        displayPracticalMarks();
    }
}
class ArtStudent extends Student{
    String electiveSubject;
    ArtStudent(String sname, int roll, int[] marks,String es){
        super(sname,roll,marks);
        electiveSubject=es;
    }
    void displayElective(){
        System.out.println("Elective Subject: "+electiveSubject);
    }
    @Override
    void display(){
        super.display();
        displayElective();
    }
}
public class Main7a {
    public static void main(String[] args){
        Student s1=new Student("A",1,new int[]{80,87,90});
        s1.compute();
        s1.display();
        Student s;
        s=new ScienceStudent("B", 2, new int[]{70,75,80},23);
        s.compute();
        s.display();
        s=new ArtStudent("C", 3, new int[]{60,75,70}, "History");
        s.compute();
        s.display();
    }
}
