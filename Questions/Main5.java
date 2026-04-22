package Questions;
import java.util.Scanner;
interface Matrix{
    void sum(int rows, int columns);
    void columnSum(int rows, int columns);
}
class InvalidMatrixException extends Exception{
    InvalidMatrixException(String msg){
        super(msg);
    }
}
class NumMatrix implements Matrix{
    int sum;
    int[][] a;
    int[] cs;
    public void sum(int rows, int columns){
        sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum+=a[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }
    public void columnSum(int rows, int columns){
        cs=new int[columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                cs[j]+=a[i][j];
            }
        }
        for(int j=0;j<columns;j++){
            System.out.println("Column " + j + ": " + cs[j]);
        }
    }
    void displayEven(int rows, int columns){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++)
                if(a[i][j]%2==0){
                    System.out.print(a[i][j]+" ");
                }
        }
    }
}
class StringMatrix implements Matrix{
    String sum="";
    String[][] a;
    String[] cs;
    public void sum(int rows, int columns){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum=sum.concat(a[i][j]);
            }
        }
        System.out.println("Sum: " + sum);
    }
    public void columnSum(int rows, int columns){
        cs=new String[columns];
        for(int j=0;j<columns;j++){
            cs[j] = "";
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                cs[j]+=a[i][j];
            }
        }
        for(int j=0;j<columns;j++){
            System.out.println(cs[j]);
        }
    }
    void checkPalindrome(int rows, int columns){
        String rev="";
        String copy="";
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                rev="";
                copy=a[i][j];
                for(int k=copy.length()-1;k>=0;k--){
                    rev+=copy.charAt(k);
                }
        
                if(copy.equals(rev)){
                    System.out.println(copy+" is a Palindrome");
                }else{
                    System.out.println(copy +" is not a Palindrome");
        }}}
    }
}
public class Main5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Menu Options");
            System.out.println("1. Numeric Matrix Operations");
            System.out.println("2. String Matrix Operations");
            System.out.println("3. Exit");
            int ch=sc.nextInt();
            NumMatrix nm;
            StringMatrix sm;
            switch(ch){
                case 1:
                    System.out.println("Enter number of rows: ");
                    int rows1=sc.nextInt();
                    System.out.println("Enter number of columns: ");
                    int columns1=sc.nextInt();
                    try{
                        if(rows1<=0 || columns1<=0){
                            throw new InvalidMatrixException("Invalid Dimension");
                        }
                        nm=new NumMatrix();
                        nm.a=new int[rows1][columns1];
                        for(int i=0; i< rows1 ;i++){
                            for(int j=0;j<columns1;j++){
                                    nm.a[i][j] = sc.nextInt();
                            }   
                    }
                    nm.sum(rows1,columns1);
                    nm.columnSum(rows1, columns1);
                    nm.displayEven(rows1, columns1);
                    }catch(InvalidMatrixException e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                case 2:
                    System.out.println("Enter number of rows: ");
                    int rows2=sc.nextInt();
                    System.out.println("Enter number fo columns: ");
                    int columns2=sc.nextInt();
                    try{
                        if(rows2<=0 || columns2<=0){
                            throw new InvalidMatrixException("Invalid Dimension");
                        }
                        sm=new StringMatrix();
                        sm.a=new String[rows2][columns2];
                        for(int i=0; i< rows2 ;i++){
                            for(int j=0;j<columns2;j++){
                                    sm.a[i][j] = sc.next();
                            }   
                    }
                    sm.sum(rows2,columns2);
                    sm.columnSum(rows2, columns2);
                    sm.checkPalindrome(rows2, columns2);
                    }catch(InvalidMatrixException e){
                        System.out.println(e.getMessage());
                    }
                    
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }

    }
}
