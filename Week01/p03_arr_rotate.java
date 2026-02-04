// 4. Write a Java program to rotate the elements of an array to the right/left  by a given 
// number of steps. The program should handle arrays of different sizes and should be 
// able to rotate the array in both directions (left and right). 
import java.util.Scanner;
public class p03_arr_rotate{
    public static void rotateLeft(int[]a,int n,int k){
        k=k%n;
        for(int r=0;r<k;r++){
            int first=a[0];
            for(int i=0;i<n-1;i++)
                a[i]=a[i+1];
                a[n-1]=first;
        }
    }
    public static void rotateRight(int[]a,int n,int k){
        k=k%n;
        for(int r=0;r<k;r++){
            int last=a[n-1];
            for(int i=n-1;i>0;i--)
                a[i]=a[i-1];
            a[0]=last;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter number of rotations: ");
        int k=sc.nextInt();
        System.out.print("ENter direction (L/R): ");
        char dir=sc.next().charAt(0);
        if(dir=='L'||dir=='l')
            rotateLeft(a,n,k);
        else
            rotateRight(a,n,k);
        System.out.println("Rotated Array: ");
        for(int i:a)
            System.out.println(i+" ");    
        sc.close();    
        }
}