package Java8Features.StreamsApi.EmployeeProject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Saiyed","Asma",75000,"pragra",30));
        emp.add(new Employee("Hedge","Ashwini",85000,"AAApragra",30));
        emp.add(new Employee("Patel","Vidhi",65000,"pragra",30));
        emp.add(new Employee("Patel","Meet",95000,"AApragra",30));
        emp.add(new Employee("Shrivastava","Shruti",75000,"pragra",30));
        emp.add(new Employee("Shah","Vanshika",100000,"Apragra",30));

        List<String> empNames= emp.stream()
                .filter(n-> n.getSalary() > 80000 && n.getCompany().startsWith("A"))
                .map(Employee::getfName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(empNames);
    }
}
