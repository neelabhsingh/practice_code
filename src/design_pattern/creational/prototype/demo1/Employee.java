package design_pattern.creational.prototype.demo1;

public class Employee implements Prototype{
    private int id;
    private String name;
    private String department;
    public Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
}
