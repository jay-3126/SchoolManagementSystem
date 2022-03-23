package myproject;

public class Teacher {

    private String tName;
    private String department;
    private int salary;
    private String mobNo;

    public Teacher(String tname, String dep, int slry, String mb) {
        this.tName = tname;
        this.department = dep;
        this.salary = slry;
        this.mobNo = mb;
    }

    public String gettName(){
        return this.tName;
    }

    public String getDepartment(){
        return this.department;
    }

    public int getSalary(){
        return this.salary;
    }

    public String getMobNo(){
        return this.mobNo;
    }
}