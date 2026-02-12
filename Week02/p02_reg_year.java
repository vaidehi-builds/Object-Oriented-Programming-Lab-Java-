package Week02;
// 2. For given a 9-digit registration number of a CSE student, identify the year of 
// joining. Assuming the first two digits specify the year of joining. 
import java.util.Scanner;
public class p02_reg_year{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your registration number (9 digit): ");
        int regno=sc.nextInt();
        int year=regno/10000000;
        System.out.println("Your year of joining is: "+ year);
        sc.close();
    }
}