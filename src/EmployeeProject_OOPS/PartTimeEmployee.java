package EmployeeProject_OOPS;

public class PartTimeEmployee extends Employee{
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.05 * hoursWorked;
    }
}
