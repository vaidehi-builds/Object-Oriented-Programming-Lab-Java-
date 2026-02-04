// Write a java program to add two numbers using the bitwise operator and check if the 
// output is an even or odd number. [Hint: use left shift and right shift bitwise operators]. 

import java.util.Scanner;
public class p02_bitwise_addn {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x,y;
        System.out.println("Enter number1: ");
        x=sc.nextInt();
        System.out.println("Enter numbre 2: ");
        y=sc.nextInt();
        while(y!=0)
        {
            int carry=(x & y)<<1;
            System.out.println("Carry: "+carry);
            x=x^y;
            System.out.println("x: "+x);
            y=carry;
            System.out.println("y: "+y);
        }
        int result=x;
        System.out.println("Sum: "+result);
        if(result%2!=0)
            System.out.println("Odd");
        else
            System.out.println("Even");
        sc.close();
    }
}
