package stream.demo;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Engineering"),
                new Employee("Bob", "Engineering"),
                new Employee("Charlie", "Sales"),
                new Employee("Dave", "Marketing"),
                new Employee("Eve", "Sales")
        );
        Map<String, List<Employee>> employeeByDepartment = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        employeeByDepartment.forEach((department,employeesInDepartment)->{
            System.out.println(department+ ":");
            employeesInDepartment.forEach(employee -> {
                System.out.println(" "+ employee.getName());
            });
        });
    }
}
