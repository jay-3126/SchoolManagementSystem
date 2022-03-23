package myproject;

public class Student {

    private String name;
    private String fName;
    private String branch;
    private int currYear;
    private String mobileNo;

    public Student(String name, String fName, String branch, int currYear, String mobileNo){
        this.name = name;
        this.fName = fName;
        this.branch = branch;
        this.currYear = currYear;
        this.mobileNo = mobileNo;
    }

    public String getName(){
        return this.name;
    }

    public String getFName(){
        return this.fName;
    }

    public String getBranch(){
        return this.branch;
    }

    public int getCurrYear(){
        return this.currYear;
    }

    public String getMobileNo(){ return this.mobileNo; }
}
