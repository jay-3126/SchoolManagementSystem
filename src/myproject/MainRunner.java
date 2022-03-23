package myproject;
import java.util.*;

public class MainRunner {
    public static void main(String args[]){

        Back data = new Back();

        System.out.println("Welcome to School Management System");

        Scanner sc = new Scanner(System.in);

        int op;

        do{
            System.out.println("Enter 1 for Teacher Management System");
            System.out.println("Enter 2 for Student Management System");
            System.out.println("Enter 8 to Exit System");

            op = sc.nextInt();

            switch (op) {
                case 1 :
                    int op1;
                    do{
                        System.out.println("Welcome to Teacher Management System");
                        System.out.println("Enter 1 to Add New Teacher");
                        System.out.println("Enter 2 to View Teacher's Info");
                        System.out.println("Enter 3 to Delete Existing Teacher's Info");
                        System.out.println("Enter 0 to Go Back");
                        op1 = sc.nextInt();

                        int id;
                        String name;
                        String dep;
                        int slry;
                        String mb;

                        switch (op1){
                            case 1:
                                System.out.println("Enter Employee Id: ");
                                id = sc.nextInt();
                                sc.nextLine();

                                System.out.println("Enter Name: ");
                                name = sc.nextLine();

                                System.out.println("Enter Department: CSE, Civil Engineering, Chemical Engineering, ECE, EEE, Mechanical Engineering");
                                dep = sc.nextLine();

                                System.out.println("Enter Salary: ");
                                slry = sc.nextInt();

                                System.out.println("Enter Mobile No: ");
                                mb = sc.next();

                                data.addTeacher(id, name, dep, slry, mb);
                                break;
                            case 2:
                                System.out.println("Enter Employee Id: ");
                                id = sc.nextInt();
                                data.showTeacher(id);
                                break;
                            case 3:
                                System.out.println("Enter Employee Id: ");
                                id = sc.nextInt();
                                data.deleteTeacher(id);
                                break;
                        }
                    }while(op1 != 0);
                    break;
                case 2 :
                    int op3;
                    int studentId;
                    String name;
                    String fName;
                    String branch;
                    int currYear;
                    String mobileNo;

                    do{
                        System.out.println("Welcome to Student Management System");
                        System.out.println("Enter 1 to Add New Student");
                        System.out.println("Enter 2 to View Existing Student");
                        System.out.println("Enter 3 to Delete Existing Student's Info");
                        System.out.println("Enter 9 to Go Back");

                        op3 = sc.nextInt();

                        switch ((op3)){
                            case 1:
                                System.out.println("Enter Student Id: ");
                                studentId = sc.nextInt();
                                sc.nextLine(); // to consume enter created by sc.nextInt()

                                System.out.println("Enter Student Name: ");
                                name = sc.nextLine();

                                System.out.println("Enter Father's Name: ");
                                fName = sc.nextLine();

                                System.out.println("Enter Branch: Chemical Engineering, Civil Engineering, CSE, ECE, EEE, Mechanical Engineering ");
                                branch = sc.nextLine();

                                System.out.println("Enter Year: ");
                                currYear = sc.nextInt();

                                System.out.println("Enter Mobile No: ");
                                mobileNo = sc.next();

                                data.addStudent(studentId,name,fName,branch,currYear,mobileNo);
                                break;
                            case 2:
                                System.out.println("Enter Student Id: ");
                                studentId = sc.nextInt();

                                data.showStudent(studentId);
                                break;
                            case 3:
                                System.out.println("Enter Student Id: ");
                                studentId = sc.nextInt();

                                data.deleteStudent(studentId);
                                break;
                        }
                    }while(op3 != 9);
                    break;
                default : System.out.println("System Closed");
            }
        }while(op!= 8);
    }
}