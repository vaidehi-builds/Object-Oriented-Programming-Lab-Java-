package Week02;
// A Taxi service offers a new service based on travel distance. Write a Java 
// program to calculate the total price from the distance by considering the following 
// charges. First 5 km = INR 10/km, Next 15 km = INR 8/km, Next 25 km = INR 
// 5/km. 
import java.util.Scanner;
public class p01_taxi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance travelled: ");
        double dist=sc.nextDouble();
        double fare=0;
        if(dist<=5){
            fare=dist*10;
        }
        else if(dist<=20){
            fare=5*10+8*(dist-5);
        }
        else if(dist<=55){
            fare=5*10+15*8+(dist-20)*5;
        }
        else{
            System.out.println("ERROR! You have exceeded the fare chart");
        }
        System.out.println("Your fare: "+fare);
        sc.close();
    }
}
