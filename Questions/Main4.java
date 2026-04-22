package Questions;
interface InsuranceOperations{
    double calculatePremium();
    void displayPolicy();
}
class InvalidPolicyDataException extends Exception{
    InvalidPolicyDataException(String msg){
        super(msg);
    }
}
class InvalidPremiumException extends Exception{
    InvalidPremiumException(String msg){
        super(msg);
    }
}
abstract class InsurancePolicy{
    protected String customerName;
    protected String policyNumber;
    protected double sumInsured;
    protected double premiumRate;
    InsurancePolicy(String cn, String pn, double si, double r) throws InvalidPolicyDataException,InvalidPremiumException{
        if(pn.length()!=6 || pn.charAt(0)!='P'|| pn.charAt(1)!='O' || pn.charAt(2)!='L'){
            throw new InvalidPolicyDataException("Invalid Policy Number!");
        }
        for(int i=3;i<6;i++){
            if(!Character.isDigit(pn.charAt(i))){
                throw new InvalidPolicyDataException("Invalid Policy Number!");
            }
        }
        customerName=cn;
        int spaceCount = 0;

        for(int i = 0; i < cn.length(); i++){
            char ch = cn.charAt(i);

            if(ch == ' '){
                spaceCount++;
            }
            else if(!Character.isLetter(ch)){
                throw new InvalidPolicyDataException("Invalid Customer Name");
             }
        }

        if(spaceCount != 1){
            throw new InvalidPolicyDataException("Invalid Customer Name");
        }
        policyNumber=pn;

        if(si <= 0){
            throw new InvalidPremiumException("Invalid Sum Insured");
        }
        sumInsured=si;
        if(r <= 0){
            throw new InvalidPremiumException("Invalid Premium Rate");
        }
        premiumRate=r;
    }

}
class HealthInsurancePolicy extends InsurancePolicy implements InsuranceOperations{
    int customerAge;
    HealthInsurancePolicy(String cn, String pn, double si, double r, int ca) throws InvalidPolicyDataException,InvalidPremiumException{
        super(cn,pn,si,r);
        customerAge=ca;
    }
    public double calculatePremium(){
        double p=premiumRate;
        if(customerAge>60) {p*=1.2;}
        return p;
    }
    public void displayPolicy(){
        System.out.println("Policy Details");
        System.out.println("Customer Name: "+customerName);
        System.out.println("Customer Age: "+customerAge);
        System.out.println("Policy Number: "+policyNumber);
        System.out.println("Sum Insured: "+sumInsured);
        System.out.println("Premium Rate: "+calculatePremium());
    }
    
}
class AutoInsurancePolicy extends InsurancePolicy implements InsuranceOperations{
    String vehicleType;
    AutoInsurancePolicy(String cn, String pn, double si, double r, String vt) throws InvalidPolicyDataException, InvalidPremiumException{
        super(cn,pn,si,r);
        vehicleType=vt;
    }
    public double calculatePremium(){
        double p=premiumRate;
        if(vehicleType.equalsIgnoreCase("SUV")){ p*=1.3;}
        else if( vehicleType.equalsIgnoreCase("Truck")){ p*=1.5;}
        else {p*=1.0;}
        return p;
    }
    public void displayPolicy(){
        System.out.println("Policy Details");
        System.out.println("Customer Name: "+customerName);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Policy Number: "+policyNumber);
        System.out.println("Sum Insured: "+sumInsured);
        System.out.println("Premium Rate: "+calculatePremium());
    }
}
public class Main4 {
    public static void main(String[] args){
        InsuranceOperations ip;
        try{
            ip=new HealthInsurancePolicy("A B", "POL123", 2300, 3.5, 23);
            ip.displayPolicy();

        }catch(InvalidPolicyDataException e1){
            System.out.println(e1.getMessage());
        }catch(InvalidPremiumException e2){
            System.out.println(e2.getMessage());
        }
        try{
            ip=new AutoInsurancePolicy("B C","PO4f",3200,3.7,"SUV");
            ip.displayPolicy();
        }catch(InvalidPolicyDataException e1){
            System.out.println(e1.getMessage());
        }catch(InvalidPremiumException e2){
            System.out.println(e2.getMessage());
        }
    }
}
