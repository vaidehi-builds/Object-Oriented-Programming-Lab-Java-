package Week09.edu.manipal.mit;

public class PrivateAccessDemo {
    public static void main(String[] args){
        Studentsp sp=new Studentsp();
        sp.setName("A");
        sp.setRollNum(1246);
        sp.display();
        //sp.sname="B"; ERROR
        //sp.rollNUm=1235;  ERROR
    }
}
