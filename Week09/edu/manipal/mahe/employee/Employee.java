package Week09.edu.manipal.mahe.employee;

public class Employee {
    private int employeeID;
    private String name;
    protected int age;
    public double basicSalary;
    public Employee(int id, String n, int a, double bs){
        employeeID=id;
        name=n;
        age=a;
        basicSalary=bs;
    }
    public String getEname(){return name;}
    public int getEAge(){return age;}
    public int getEId(){return employeeID;}
}

