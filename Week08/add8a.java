package Week08;
import java.util.Scanner;
class Phone{
    String brand;
    int memCapacity;
    Phone(String b, int m){
        brand=b;
        memCapacity=m;
    }
    interface Callable{
        void makeAudioCall(String cellNum);
        void makeVideoCall(String cellNum);
    }
}
class BasicPhone extends Phone{
        BasicPhone(String brand, int memCapacity) {
        super(brand, memCapacity);
        }

        public void makeAudioCall(String cellNum) {
        System.out.println("BasicPhone (" + brand + ") making audio call to " + cellNum);
        }

        public void makeVideoCall(String cellNum) {
        System.out.println("BasicPhone (" + brand + ") does NOT support video calls");
        }
}
    class SmartPhone extends Phone implements Phone.Callable {

    SmartPhone(String brand, int memCapacity) {
        super(brand, memCapacity);
    }

    public void makeAudioCall(String cellNum) {
        System.out.println("SmartPhone (" + brand + ") making audio call to " + cellNum);
    }

    public void makeVideoCall(String cellNum) {
        System.out.println("SmartPhone (" + brand + ") making video call to " + cellNum);
    }
}
public class add8a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter BasicPhone brand: ");
        String b1 = sc.nextLine();
        System.out.print("Enter BasicPhone memory capacity: ");
        int m1 = sc.nextInt();
        sc.nextLine();

        BasicPhone bp = new BasicPhone(b1, m1);

        System.out.print("Enter SmartPhone brand: ");
        String b2 = sc.nextLine();
        System.out.print("Enter SmartPhone memory capacity: ");
        int m2 = sc.nextInt();

        SmartPhone sp = new SmartPhone(b2, m2);

        System.out.println("\n--- Calling using BasicPhone ---");
        bp.makeAudioCall("9876543210");
        bp.makeVideoCall("9876543210");

        System.out.println("\n--- Calling using SmartPhone ---");
        sp.makeAudioCall("1234567890");
        sp.makeVideoCall("1234567890");

        sc.close();
    }
}

