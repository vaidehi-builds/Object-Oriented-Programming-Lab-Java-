package Week02;
// 3. For a given date of birth of a person, calculate the date of retirement by taking 
// years of service as input. (assume service periods as 60 years).
import java.util.Scanner;
public class p03_retire_date {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your birthdate ");
        System.out.print("Enter the date: ");
        int date=sc.nextInt();
        System.out.print("Enter the month: ");
        int month=sc.nextInt();
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        int mday=0;
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                mday=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                mday=30;
                break;
            case 2:
                if(year%400==0 || year%4==0 && year%100!=0)
                    mday=29;
                else
                    mday=28;
                break;
        }
        int ryear=year+60;
        System.out.println("Your birthdate is: "+date+"/"+month+"/"+year);
        System.out.println("Your retirement date is: "+mday+"/"+month+"/"+ryear);
        sc.close();
    }
}
