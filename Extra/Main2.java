package Extra;
class Student{
    String name;
    int id;
    Student(String n, int i){name=n;id=i;}
}
interface Sports{
    int sgrade=0;
    void setsgrade(int sgrade);
}
interface Exam{
    int egrade=0;
    void setegrade(int egrade);
}
class Results extends Student implements Sports,Exam{
    int sgrade;
    int egrade;
    String fresult;
    Results(String n, int id, int s, int e){super(n,id); sgrade=s; egrade=e;}
    public void setegrade(int e){egrade=e;}
    public void setsgrade(int s){sgrade=s;}
    void computeResult() {
        int total = sgrade + egrade;
        if (total >= 90) fresult = "Excellent";
        else if (total >= 70) fresult = "Good";
        else fresult = "Average";
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Sports Grade: " + sgrade);
        System.out.println("Exam Grade: " + egrade);
        System.out.println("Result: " + fresult);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Results r = new Results("Anya", 101, 45, 50);
        r.computeResult();
        r.display();
    }
}

