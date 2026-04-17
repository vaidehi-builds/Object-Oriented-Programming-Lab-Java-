package Week07;
class Account{
    String cname;
    long accno;
    double balance;
    Account(String cname,long accno,double balance){
        this.cname=cname;
        this.accno=accno;
        this.balance=balance;
    }
    void deposit(double amt){
        balance+=amt;
    }
    void withdraw(double amt){
        if(amt<=balance) balance-=amt;
        else System.out.println("Insufficient Balance!");
    }
    void displayAccDetails(){
        System.out.println("Customer Name: "+cname);
        System.out.println("Account Number: "+accno);
        System.out.println("Balance: "+balance);
    }
}
class SavingsAcc extends Account{
    static final double interestRate=0.05;
    double interest;
    SavingsAcc(String n, long an,double bal){super(n,an,bal);}
    void AddInterest(){interest=balance*interestRate;balance+=interest;}
    @Override
    void displayAccDetails(){
        super.displayAccDetails();
        System.out.println("Interest: "+interest);
    }
}
class CurrentAcc extends Account{
    double minbal=1000;
    CurrentAcc(String c,long a,double b){super(c,a,b);}
    @Override
    void withdraw(double amt){
    if(amt <= balance){
        balance -= amt;
        checkMinimum();
    } else {
        System.out.println("Insufficient Balance!");
    }
}
    
    void checkMinimum(){
        if(balance<minbal){
            System.out.println("Minimum Balance not maintained. Penalty of 100 imposed");
            balance-=100;
        }
    }
    @Override
    void displayAccDetails(){
        super.displayAccDetails();
        System.out.println("Minimum Balance: "+minbal);
    }
}
public class Main7d {
    public static void main(String[] args){
        Account s=new SavingsAcc("Adrija",123456789,12000);
        s.deposit(1300);
        ((SavingsAcc) s).AddInterest();
        s.withdraw(12300);
        System.out.println();
        s.displayAccDetails();
        System.out.println();
        Account c=new CurrentAcc("Anaya", 1234567653, 12000);
        c.deposit(100);
        c.withdraw(11400);
        c.displayAccDetails();
    }
}
