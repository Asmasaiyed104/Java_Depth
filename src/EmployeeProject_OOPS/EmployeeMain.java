package EmployeeProject_OOPS;


/*
*
* ## Problem: Employee Management System
You are tasked with creating a simple Employee Management System.
You need to design a system using Java that demonstrates inheritance, polymorphism,
encapsulation, constructors, and methods.

Requirements
Create a base class called Employee:

## Private Fields:
id (int)
name (String)
salary (double)
Constructors:

## A parameterized constructor to initialize all fields.
Methods:
getId(): Returns the ID of the employee.
getName(): Returns the name of the employee.
getSalary(): Returns the salary of the employee.
setSalary(double salary): Sets the salary of the employee.
calculateBonus():  method to calculate a bonus for the employee.
Create a subclass called FullTimeEmployee that extends Employee:

## Additional Fields:
annualLeaveDays (int)
Constructors:
A parameterized constructor that initializes all fields including those of the superclass.
Methods:
getAnnualLeaveDays(): Returns the number of annual leave days.
setAnnualLeaveDays(int leaveDays): Sets the number of annual leave days.
Override calculateBonus(): Implement this method to calculate a bonus as 10% of the salary.
Create another subclass called PartTimeEmployee that extends Employee:

## Additional Fields:
hoursWorked (int)
Constructors:
A parameterized constructor that initializes all fields including those of the superclass.
Methods:
getHoursWorked(): Returns the number of hours worked.
setHoursWorked(int hours): Sets the number of hours worked.
Override calculateBonus(): Implement this method to calculate a bonus as 5% of the salary per hour worked.
Demonstrate Polymorphism:

## Create an array of Employee objects that contains both FullTimeEmployee and PartTimeEmployee instances.
## Iterate through the array and print out the details and bonus of each employee by calling the
## calculateBonus() method.*///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class EmployeeMain {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0]=new FullTimeEmployee(1,"Asma",12000.30);
        employees[1] = new PartTimeEmployee(2, "Deep", 20000.20);
        employees[2] = new FullTimeEmployee(3, "Ashwini", 60000.25);

        for (Employee emp : employees) {
            emp.displayEmployeeDetails();
            System.out.println("Bonus: " + emp.calculateBonus());
            System.out.println("---------------------------");
        }


        FullTimeEmployee ft = new FullTimeEmployee(101, "mark", 20000);

        double salary = ft.getSalary();
        System.out.println("Salrary : " +salary);


        double bonus = ft.calculateBonus();
        System.out.println("Bonus " + bonus);



        PartTimeEmployee pt = new PartTimeEmployee(1,"Asma", 120000);
        double ptBonus  = pt.calculateBonus();
        System.out.println("partTimeBonus " + ptBonus);

//        employees[0] = new FullTimeEmployee(1, "Asma", 50000, 20);
//        employees[1] = new PartTimeEmployee(2, "Deep", 20000, 20);
//        employees[2] = new FullTimeEmployee(3, "Ashwini", 60000, 25);
//
//
//        for (Employee emp : employees) {
//            emp.displayEmployeeDetails();
//            System.out.println("Bonus: " + emp.calculateBonus());
//            System.out.println("---------------------------");
//        }

    }




}