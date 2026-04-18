package Week08;
class Student{
    int roll,m1,m2;
    void getRollNum(int r){
        roll=r;
    }
    void putRollNum(){System.out.println("Roll NUmber: "+roll);}
    void getMarks(int mar1, int mar2){
        m1=mar1;
        m2=mar2;
        }
        void putMarks(){
            System.out.println("Marks: "+m1+" and "+m2);
        }
    }
interface Sports{
    void putSportsScore(int s);
}
class Result extends Student implements Sports{
    int sports;
    public void putSportsScore(int s){sports=s;}
    void display(){
        putRollNum();
        putMarks();
        System.out.println("Sports: "+sports);
        System.out.println("Totol: "+(m1+m2+sports));
    }
}
public class Main8c{
    public static void main(String[] args){
        Result r=new Result();
        r.getRollNum(123);
        r.getMarks(95, 98);
        r.putSportsScore(90);
        r.display();
    }
}
