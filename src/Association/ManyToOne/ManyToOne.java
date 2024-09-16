package Association.ManyToOne;

import Inheritance.B;

class Student{
    String rollNo;
    String name;

    Branch branch;

    public Student(String rollNo, String name, Branch branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
    }
    void getStudentDetails(){
        System.out.println("Student Roll No : " + rollNo);
        System.out.println("Student Name : " + name);
        System.out.println("Student Branch Code : " + branch.branchCode);
        System.out.println("Student Branch Name : " + branch.branchName);
        System.out.println("---------------------------");
    }
}
class Branch{
    String branchCode;
    String branchName;

    public Branch(String branchCode, String branchName) {
        this.branchCode = branchCode;
        this.branchName = branchName;
    }
}
public class ManyToOne {
    public static void main(String[] args) {
       Branch b1 = new Branch("cse01", "CSE");
       Student s1 = new Student("101", "Asma",b1);
        Student s2 = new Student("102", "Shusma",b1);
        Student s3 = new Student("103", "Resma",b1);
        s1.getStudentDetails();
        s2.getStudentDetails();
        s3.getStudentDetails();

    }



}
