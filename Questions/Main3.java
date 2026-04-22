package Questions;
import java.util.Scanner;
interface TicketOperations{
    void bookTicket();
    void cancelTicket(int passengerId) throws PassengerNotFoundException;
    void displayDetails();
}
class Passenger{
    int id;
    String name;
    int age;
    double fare;
    String ticketType;
    Passenger(int id, String n, int a, double f, String tt){
        this.id=id;
        name=n;
        fare=f;
        age=a;
        ticketType=tt;
    }
    void display(){
        System.out.println("Passenger Details");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Age: "+age);
        System.out.println("Fare: "+fare);
        System.out.println("Ticket type: "+ticketType);
    }
}
class Train{
    int trainNumber;
    String trainType;
    String departureTime;
    String source;
    String destination;
    Passenger[] p;
    Train(int tn, String tt,String dt, String s, String d,int n){
        trainNumber=tn;
        trainType=tt;
        departureTime=dt;
        source=s;
        destination=d;
        p=new Passenger[n];
    }
    void displayTrainInfo(){
        System.out.println("TRAIN DETAILS");
        System.out.println("Train Number: "+trainNumber);
        System.out.println("Train Type: "+trainType);
        System.out.println("Departure Time: "+departureTime);
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
    }
}
class LocalTrain extends Train implements TicketOperations{
    int pc;
    Scanner sc=new Scanner(System.in);
    LocalTrain(int tn, String tt,String dt, String s, String d, int n){
        super(tn,tt,dt,s,d,n);
    }
    public void bookTicket(){
        System.out.println("Enter Passenger Details: ");
        System.out.print("Enter id: ");
        int ide=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        System.out.print("Enter fare: ");
        double fare=sc.nextDouble();
        System.out.println("Enter ticket type: ");
        String tt=sc.next();
        Passenger pass=new Passenger(ide, name, age, fare, tt);
        if(pc<p.length){
            p[pc++]=pass;
        }
        else {System.out.println("No Seats Available");}
    }
    public void cancelTicket(int passengerId) throws PassengerNotFoundException{
        boolean found=false;
        for(int i=0;i<pc;i++){
            if(passengerId==p[i].id){
                for(int j=i;j<pc-1;j++){
                    p[j]=p[j+1];
                }
                p[pc-1]=null;
                pc--;
                found=true;
                break;
            }
            
        }
        if((found==false)) {throw new PassengerNotFoundException("Passenger ID not found");}
    }
    public void displayDetails(){
        super.displayTrainInfo();
        for(int i=0;i<pc;i++){
            p[i].display();
        }
    }
}
class ExpressTrain extends Train implements TicketOperations{
    int pc;
    Scanner sc=new Scanner(System.in);
    ExpressTrain(int tn, String tt,String dt, String s, String d, int n){
        super(tn,tt,dt,s,d,n);
    }
        public void bookTicket(){
        System.out.println("Enter Passenger Details: ");
        System.out.print("Enter id: ");
        int ide=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter age: ");
        int age=sc.nextInt();
        System.out.print("Enter fare: ");
        double fare=sc.nextDouble();
        System.out.println("Enter ticket type: ");
        String tt=sc.next();
        Passenger pass=new Passenger(ide, name, age, fare, tt);
        if(pc<p.length){
            p[pc++]=pass;
        }
        else {System.out.println("No Seats Available");}
    }
    public void cancelTicket(int passengerId) throws PassengerNotFoundException{
        boolean found=false;
        for(int i=0;i<pc;i++){
            if(passengerId==p[i].id){
                for(int j=i;j<pc-1;j++){
                    p[j]=p[j+1];
                }
                p[pc-1]=null;
                pc--;
                found=true;
                break;
            }
            
        }
        if((found==false)) {throw new PassengerNotFoundException("Passenger ID not found");}
    }
    public void displayDetails(){
        super.displayTrainInfo();
        for(int i=0;i<pc;i++){
            p[i].display();
        }
    }
}
class PassengerNotFoundException extends Exception{
    PassengerNotFoundException(String msg){
        super(msg);
    }
}
public class Main3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LocalTrain lt=new LocalTrain(101,"LocaL","10:00 AM","Thane","Mumbai Central",3);
        ExpressTrain et = new ExpressTrain(202, "Express", "12:00 PM", "Delhi", "Mumbai", 3);
        while(true){
            System.out.println("\n1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Display Details");
            System.out.println("4. Exit");

            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("1. Local Train");
                    System.out.println("2. Express Train");
                    int t = sc.nextInt();
                    if(t == 1){
                        lt.bookTicket();
                    } else {
                        et.bookTicket();
                    }
                    break;
                case 2:
                    System.out.println("Enter ID to cancel: ");
                    int id=sc.nextInt();
                    System.out.println("1. Local Train");
                    System.out.println("2. Express Train");
                    int tr = sc.nextInt();

                    try{
                        if(tr == 1){
                            lt.cancelTicket(id);
                        } else {
                            et.cancelTicket(id);
                        }
                    } catch(PassengerNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("1. Local Train");
                    System.out.println("2. Express Train");
                    int ta = sc.nextInt();

                    if(ta == 1){
                        lt.displayDetails();
                    } else {
                        et.displayDetails();
                    }
                    break;
                case 4:
                    System.out.println("Exiting");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
        
    }
}
