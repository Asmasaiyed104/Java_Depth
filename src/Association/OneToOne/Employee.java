package Association.OneToOne;

public class Employee {

    String empname;
    String empid;
    Address addr;

    public Employee(String empid, String empname, Address addr) {
        this.empid = empid;
        this.empname = empname;
        this.addr = addr;
    }

    void showEmpDetails(){
        System.out.println("EMployeeId : " + empid);
        System.out.println("Employee Name : " + empname);
        System.out.println("Employee address:");
        System.out.println("Location: " + addr.location);
        System.out.println("City: " + addr.city);
        System.out.println("State: "+ addr.state);

    }
}
