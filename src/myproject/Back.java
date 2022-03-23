package myproject;
import java.util.*;

public class Back {

    public HashMap<Integer, Student> studentData;
    public HashMap<Integer, Teacher> teacherData;

    Back(){
        studentData = new HashMap<>();
        teacherData = new HashMap<>();
    }

    public void addTeacher(int id, String tname, String dep, int slry, String mb){

        Teacher newTeacher = new Teacher(tname, dep, slry, mb);
        teacherData.put(id,newTeacher);
        System.out.println("Teacher Added Successfully");
    }

    public void showTeacher(int eId){
        if(teacherData.containsKey(eId)){
            Teacher teacherInfo = teacherData.get(eId);
            System.out.println("Name:" + teacherInfo.gettName());
            System.out.println("Department:" + teacherInfo.getDepartment());
            System.out.println("Salary:" + teacherInfo.getSalary());
            System.out.println("Mobile No.:" + teacherInfo.getMobNo());
        }else{
            System.out.println("Data not Found");
        }
    }

    public void deleteTeacher(int eId){
        teacherData.remove(eId);
        System.out.println("Teacher Deleted Successfully");
    }

    public void addStudent(int studentId, String name, String fName, String branch, int currYear, String mobileNo){
        Student newStudent = new Student(name, fName, branch, currYear, mobileNo);
        studentData.put(studentId, newStudent);
        System.out.println("Student Added Successfully");
    }

    public void showStudent(int studentId){

        if(studentData.containsKey(studentId)){
            Student studentInfo = studentData.get(studentId);
            System.out.println("Name:" + studentInfo.getName());
            System.out.println("Father's Name:" + studentInfo.getFName());
            System.out.println("Branch:" + studentInfo.getBranch());
            System.out.println("Current Year:" + studentInfo.getCurrYear());
            System.out.println("Mobile No.:" + studentInfo.getMobileNo());
        }else{
            System.out.println("Data not Found");
        }
    }

    public void deleteStudent(int studentId){
        studentData.remove(studentId);
        System.out.println("Student Deleted Successfully");
    }
}
