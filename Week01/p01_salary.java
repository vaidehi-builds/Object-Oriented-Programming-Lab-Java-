// 1. Write a Java program to accept the number of hours worked, hourly rate and calculates 
// the salary for an employee according to the following criteria: The company pays 
// straight time for the first 40 hours worked by each employee and time and a half for 
// all hours worked in excess of 40 hours. 
import java.util.Scanner;
public class p01_salary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double hour,rate,ehr,sal;
        System.out.println("Enter number of hours: ");
        hour=sc.nextDouble();
        System.out.println("Enter hourly rate: ");
        rate=sc.nextDouble();
        ehr=hour-40;
        if(ehr>0)
            sal=40*rate+ehr*1.5*rate;
        else
            sal=rate*hour;
        System.out.println("Salary: "+sal);
        sc.close();
    }
}