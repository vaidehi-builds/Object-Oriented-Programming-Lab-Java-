package Week09.edu.manipal.mahe.main;
import Week09.edu.manipal.mahe.employee.Employee;
import Week09.edu.manipal.mahe.department.Department;
import Week09.edu.manipal.mahe.payroll.Payroll;
public class Main {
    public static void main(String[] args){
        Employee e=new Employee(123,"Abhaay",23,50000);
        Department d=new Department("IT", "Mr M", "Office");
        Payroll p=new Payroll(e, d);
        p.generatePaySlip();
    }
}
