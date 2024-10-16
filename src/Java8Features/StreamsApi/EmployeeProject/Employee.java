package Java8Features.StreamsApi.EmployeeProject;

public class Employee {
    private String fName;
    private String lName;
    private int salary;
    private String company;
    private int age;

    public Employee(String lName, String fName, int salary, String company, int age) {
        this.lName = lName;
        this.fName = fName;
        this.salary = salary;
        this.company = company;
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
