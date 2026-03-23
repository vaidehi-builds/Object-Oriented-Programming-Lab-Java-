package Week02;
// Write a Java program to display non principle diagonal elements and find their sum. 
import java.util.Scanner;
public class p04_nonprinciple_dia {
    public static void main(String[] args){    
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the square matrix: ");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the matrix elements: ");
        int i,j;
        int sum=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("THe non principle diagonal elements are: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if((i+j)==(n-1)){
                    System.out.println(a[i][j]+" ");
                    sum+=a[i][j];
                }
            }
        }
        System.out.println("The sum is: "+sum);
        sc.close();
    }
}
