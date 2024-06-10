package solid.demo;

enum EmploymentType{
    FULL_TIME,
    PART_TIME,
    CONTRACT
}

class Employee{
    private EmploymentType employmentType;
    public Employee(EmploymentType employmentType){
        this.employmentType = employmentType;
    }
    public EmploymentType getEmploymentType(){
        return employmentType;
    }
}
interface SalaryCalculator{
    double calculateSalary(Employee employee);
}
class FullTimeSalaryCalculator implements  SalaryCalculator{
    @Override
    public double calculateSalary(Employee employee) {
        System.out.println("Calculate Full Time salary");
        return 5000;
    }
}

class PartTimeSalaryCalculator implements SalaryCalculator{
    @Override
    public double calculateSalary(Employee employee) {
        System.out.println("Calculate Part time Salary");
        return 2500;
    }
}


class PayrollCalculator{
    SalaryCalculator salaryCalculator;
    public PayrollCalculator(SalaryCalculator salaryCalculator){
        this.salaryCalculator = salaryCalculator;
    }
    public double calculateSalary(Employee employee){
        return salaryCalculator.calculateSalary(employee);
    }
}
public class Main{
    public static void main(String[] args) {
        System.out.println("Full Time Salary Calculator");
        Employee fullTimeEmployee = new Employee(EmploymentType.FULL_TIME);
        PayrollCalculator fullTimePayrollCalculator  = new PayrollCalculator(new FullTimeSalaryCalculator());
        System.out.println("FullTime employee Salary :"+ fullTimePayrollCalculator.calculateSalary(fullTimeEmployee));
        System.out.println("*********");
        System.out.println("Part Time Salary Calculator");
        Employee partTimeEmployee = new Employee(EmploymentType.PART_TIME);
        PayrollCalculator partTimeSalaryCalculator = new PayrollCalculator(new PartTimeSalaryCalculator());
        System.out.println("Part Time Employee Salary:"+ partTimeSalaryCalculator.calculateSalary(partTimeEmployee));
    }
}