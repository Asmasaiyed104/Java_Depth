package EmployeeProject_OOPS;

public class FullTimeEmployee extends Employee {


    private int annualLeaveDays;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    public int getAnnualLeaveDays() {
        return annualLeaveDays;
    }

    public void setAnnualLeaveDays(int annualLeaveDays) {
        this.annualLeaveDays = annualLeaveDays;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }
}