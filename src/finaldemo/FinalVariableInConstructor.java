package finaldemo;

class Person{
    private final String name;
    private final int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class FinalVariableInConstructor {
    public static void main(String[] args) {
        Person alice = new Person("Alice", 30);
        System.out.println("Name:"+ alice.getName());
        System.out.println("Age:"+ alice.getAge());
    }


}
