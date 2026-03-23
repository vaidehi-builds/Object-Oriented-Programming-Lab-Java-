package Week02;
//Write a java program o print the factorial of a given number recursively.
import java.util.Scanner;
class p05_factorial{
    static int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is: "+fact(n));
        sc.close();
    }
}
