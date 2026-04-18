package Week08;
import java.util.*;
interface InfInterest{
    double r=5;
    double calculateInterest();
}
class SimpleInterest implements InfInterest{
    int time;
    int principle;
    SimpleInterest(int t,int p){
        time=t;
        principle=p;
    }
    public double calculateInterest(){
        return (principle*time*r*0.01);
    }
}
class CompoundInterest implements InfInterest{
    int time;
    int principle;
    CompoundInterest(int t,int p){
        time=t;
        principle=p;
    }
    public double calculateInterest(){
        return principle*((Math.pow(1+(r*0.01),time))-1);
}
}
public class add8b {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int pa,t;
        char type;
        System.out.println("Enter principla amt: ");
        pa=sc.nextInt();
        System.out.println("Enter Time(in years): ");
        t=sc.nextInt();
        System.out.println("Enter which type of interest to be calcuclated(s/c): ");
        type=sc.next().charAt(0);
        InfInterest obj;
        if (type == 's') {
            obj = new SimpleInterest(t, pa);
        } else {
            obj = new CompoundInterest(t, pa);
        }
        System.out.println("Interest: " + obj.calculateInterest());
        sc.close();
    }
}
