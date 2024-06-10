package stream.group_by;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;
import java.util.*;
class Employee{
    int id;
    String name;
    double salary;
    String department;
    String address;
    public Employee(int id, String name, double salary, String department, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.address = address;
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
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
public class GroupByDemo{
        public static void main(String[] args){
            Map<Integer, Employee> employeeMap = new HashMap<>();

            employeeMap.put(1, new Employee(1, "John Doe", 5000.0, "IT", "123 Main St."));
            employeeMap.put(2, new Employee(2, "Jane Smith", 6500.0, "HR", "456 Oak St."));
            employeeMap.put(3, new Employee(3, "Michael Johnson", 7200.0, "Finance", "789 Elm St."));
            employeeMap.put(4, new Employee(4, "Emily Williams", 4800.0, "Marketing", "321 Pine St."));
            employeeMap.put(5, new Employee(5, "David Brown", 6000.0, "Sales", "654 Maple St."));
            employeeMap.put(6, new Employee(6, "Sarah Davis", 5500.0, "IT", "987 Cedar St."));
            employeeMap.put(7, new Employee(7, "Robert Wilson", 7500.0, "Finance", "159 Oak St."));
            employeeMap.put(8, new Employee(8, "Jessica Miller", 6200.0, "HR", "753 Elm St."));
            employeeMap.put(9, new Employee(9, "Christopher Taylor", 5700.0, "Marketing", "246 Pine St."));
            employeeMap.put(10, new Employee(10, "Ashley Anderson", 6300.0, "Sales", "369 Maple St."));

            Map<String, Optional<Employee>> highestSalaryByDepartment = employeeMap.values().stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
            System.out.println("Highest Salary by Department"+ highestSalaryByDepartment);
            for(Map.Entry<String, Optional<Employee>> entry : highestSalaryByDepartment.entrySet()){
                String department = entry.getKey();
                Optional<Employee> highestSalaryEmployee = entry.getValue();
                if(highestSalaryEmployee.isPresent()){
                    Employee employee = highestSalaryEmployee.get();
                    System.out.println("Department: "+ department +", Highest Salary Employee: "+ employee);
                }else {
                    System.out.println("Department: "+ department+ ", No employees found");
                }
            }
            List<Employee> employees = Arrays.asList(
                    new Employee(1, "EMP1", 5, "dep1", "AC"),
                    new Employee(2, "EMP2", 3, "dep2", "DF"),
                    new Employee(12, "EMP12", 6, "dep3", "GH")
            );

            Map<String, Optional<Employee>> maxSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        }
    }
