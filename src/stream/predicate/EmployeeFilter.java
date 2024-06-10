package stream.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
class Employee{
    private int id;
    private String name;
    private double Salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
public class EmployeeFilter {
    public static void main(String[] args) {
        Predicate<Employee> salaryMoreThan5000 = employee -> employee.getSalary() > 50000;
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 12344),
                new Employee(2, "Bob", 434334),
                new Employee(3, "Charlie", 49993),
                new Employee(4, "Dave", 9399292),
                new Employee(5, "Eve", 932900)
        );

    }
}
