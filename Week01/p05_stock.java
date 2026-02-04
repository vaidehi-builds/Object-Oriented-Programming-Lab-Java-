// 5. Write a Java program to manage stock information for multiple products. The program 
// should store the product name, product price, and quantity in separate one
// dimensional arrays for n items. The user should be able to specify which products they 
// want to purchase and the desired quantity for each. Based on the user’s input, the 
// program should generate and display the total bill. 

import java.util.Scanner;
class p05_stock{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(("Enter number of products: "));
        int n=sc.nextInt();
        String[] name=new String[n];
        double[] price=new double[n];
        int[] stock=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter product name: ");
            name[i]=sc.next();
            System.out.print("Enter price: ");
            price[i]=sc.nextDouble();
            System.out.print("Enter stock: ");
            stock[i]=sc.nextInt();
        }
        double total=0;
        for(int i=0;i<n;i++){
            System.out.println("Enter quantity required for "+name[i]+": ");
            int req=sc.nextInt();
            if(req>stock[i]){
                System.out.println(name[i]+" is Out of Stock");
            }
            else{
                double cost=price[i]*req;
                System.out.println(name[i]+": "+cost);
                total+=cost;
            }
        }
        System.out.println("--Bill Details--");
        System.out.println("Total Bill Amount: ");
        System.out.println(total);

        sc.close();
    }
}