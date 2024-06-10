package design_pattern.creational.prototype.demo1;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException{
        Employee emp1 = new Employee(1, "John", "Development");
        Employee emp2 = new Employee(2, "Jane", "Marketing");

        PrototypeFactory.addPrototype("DEV", emp1);
        PrototypeFactory.addPrototype("MARKETING", emp2);

        // Create new employees based on prototypes
        Employee clonedEmp1 = (Employee) PrototypeFactory.getInstance("DEV");
        Employee clonedEmp2 = (Employee) PrototypeFactory.getInstance("MARKETING");

        System.out.println("Cloned Employee 1: " + clonedEmp1.getName());
        System.out.println("Cloned Employee 2: " + clonedEmp2.getName());
    }
}
