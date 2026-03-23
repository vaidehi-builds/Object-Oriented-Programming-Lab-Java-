package Week02;
// Write a Java program to compute the electricity bill for an industry using a 
// switch-case statement. The program should take the daily consumption in units 
// for 7 days as input. Based on the total consumption, the program should 
// calculate and display the total electricity bill according to the following pricing 
// table: 
// Units             Price per Unit (INR) 
// 0 - 100            7.00
// 101 - 200          8.00
// >= 201              10.00
import java.util.Scanner;
 public class p06_elec_bill {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[7];
        System.out.println("Enter the daily consumption in units");
        int i;
        int sum=0;
        for(i=0;i<7;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("The total consumption is: "+sum);
        double bill=0;
        if(sum>0 && sum<=100){
            bill=sum*7;
        }
        else if(sum>100 && sum<=200){
            bill=100*7+(sum-100)*8;
        }
        else
            bill=100*7+100*8+(sum-200)*10;
        System.out.println("The totoal bill is: "+bill);
        sc.close();
        
    }
}
