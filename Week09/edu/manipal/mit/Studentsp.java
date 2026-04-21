package Week09.edu.manipal.mit;

public class Studentsp {
    private String sname;
    private int rollNum;
    public void setName(String n){
        sname=n;
    }
    public void setRollNum(int num){
        rollNum=num;
    }
    void display(){
        System.out.println("Name: "+sname);
        System.out.println("Roll NUmber: "+rollNum);
    }
}
