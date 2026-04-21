package Week10;
class InvalidSalaryException extends Exception{
    InvalidSalaryException(String m){
        super(m);
    }
}
class ContractLimitExceededException extends Exception{
    ContractLimitExceededException(String n){
        super(n);
    }
}
class Employee{
    String name;
    double sal;
    void setSal(double sal) throws InvalidSalaryException{
        if(sal<50000){throw new InvalidSalaryException("Salary Less than Minimum Wage!");}
        this.sal=sal;
    }
    void display(){
        System.out.println("Employee name: "+name);
        System.out.println("Salary: "+sal);
    }
}
class ContractEmployee extends Employee{
    int contractDuration;
    void setContractDuration(int cd) throws ContractLimitExceededException{
        if(cd>24){throw new ContractLimitExceededException("Contract Duration exceeds maximum limit");}
        contractDuration=cd;
    }
    void displayc(){
        super.display();
        System.out.println("Contract DUration: "+contractDuration);
    }
}
public class EmployeeExceptionDemo {
    public static void main(String[] args){
        ContractEmployee e= new ContractEmployee();
        e.name="A";
        try{
            e.setSal(25000);
            e.setContractDuration(12);
            e.displayc();
        }catch(InvalidSalaryException em){
            System.out.println("Error! : "+em.getMessage());
        }catch(ContractLimitExceededException ems){
            System.out.println("Erroe! : "+ems.getMessage());
        }
        try{
            e.setSal(55000);
            e.setContractDuration(12);
            e.displayc();
        }catch(InvalidSalaryException em){
            System.out.println("Error! : "+em.getMessage());
        }catch(ContractLimitExceededException ems){
            System.out.println("Erroe! : "+ems.getMessage());
        }
    }
}
