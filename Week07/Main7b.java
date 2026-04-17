package Week07;
class Employee{
    String ename;
    int eid;
    double bsalary;
    Employee(String n,int id,double sal){
        ename=n;
        eid=id;
        bsalary=sal;
    }
    double calculateSalary(){return bsalary;}
    void displayEmployeeDetails(){
        System.out.println("Name: "+ename);
        System.out.println("ID: "+eid);
        System.out.println("Salary: "+bsalary);
    }
}
class PartTimeEmp extends Employee{
    int hoursWorked;
    static final double hourlyRate=200;
    PartTimeEmp(String n,int id,double s, int h){
        super(n,id,s);
        hoursWorked=h;
    }
    @Override
    double calculateSalary(){return bsalary+(hourlyRate*hoursWorked);}
    @Override
    void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("Hours worked: "+hoursWorked);
        System.out.println("Hourly Rate: "+hourlyRate);
        System.out.println("Final Salary: "+calculateSalary());
    }
}
class FullTimeEmp extends Employee{
    double bonus,ded;
    FullTimeEmp(String n, int id, double bs, double b, double d){
        super(n,id,bs);
        bonus=b;
        ded=d;
    }
    @Override
    double calculateSalary(){ return bsalary+bonus-ded;}
    @Override
    void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("Bonus: "+bonus);
        System.out.println("Deduction: "+ded);
        System.out.println("Final Salary: "+calculateSalary());
    }
}

public class Main7b {
    public static void main(String[] args){
        Employee e1=new Employee("Anya",1234,20000);
        e1.displayEmployeeDetails();
        Employee e2;
        e2=new FullTimeEmp("Manya", 1235, 20000, 10000, 500);
        e2.displayEmployeeDetails();
        e2=new PartTimeEmp("Vanya", 1236, 20000, 15);
        e2.displayEmployeeDetails();
    }
}
