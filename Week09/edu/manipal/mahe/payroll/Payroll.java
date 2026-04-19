package Week09.edu.manipal.mahe.payroll;
import Week09.edu.manipal.mahe.employee.Employee;
import Week09.edu.manipal.mahe.department.Department;
public class Payroll {
    private Employee employee;
    private Department department;
    double net;
    public Payroll(Employee e, Department d){
        employee=e;
        department=d;
    }
    private void calculateNetSalary(){
        double da=0.52*employee.basicSalary;
        double gs=employee.basicSalary+da;
        double it=0.3*gs;
        net=gs-it;
    }
    public void generatePaySlip(){
        System.out.println("Payslip fpr January 2026");
        System.out.println("Employee Name: "+employee.getEname());
        System.out.println("Employee Age: "+employee.getEAge());
        System.out.println("Employee ID: "+employee.getEId());
        calculateNetSalary();
        System.out.println("Employee Department: "+department.getDname());
        System.out.println("Employee Net Salary: "+net);
    }   
}
