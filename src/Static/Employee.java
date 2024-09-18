package Static;

public class Employee {

    int empid;
    String empname;
   static String empcomname = "SaiyedTech";

    public Employee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }
    void display(){
        System.out.println("-------Employee Details--------");
        System.out.println("EmployeeId : "+ empid);
        System.out.println("Employee Name : "+empcomname);
        System.out.println("Employee Company Name : " + empcomname);
        System.out.println();
    }
}
class Company{
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Asma");
        Employee e2 = new Employee(102, "Zoheb");
        Employee e3 = new Employee(102, "Noumu");

        e1.display();
        e2.display();
        e3.display();
    }
}
