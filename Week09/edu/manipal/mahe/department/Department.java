package Week09.edu.manipal.mahe.department;

public class Department {
    private String departmentName;
    protected String manager;
    public String location;
    public Department(String n, String m, String l){
        departmentName=n;
        manager=m;
        location=l;
    }
    public String getDname(){return departmentName;}
}
