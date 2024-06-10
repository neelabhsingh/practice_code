package lambda_expression.demo1;
import java.util.*;
public class LambdaExpression {
    public static void main(String[] args) {
            Person person1 = new Person("Neelabh", "Singh", 30);
            Person person2 = new Person("Amit", "Maurya", 31);
            Person person3 = new Person("Neeraj", "Maurya", 24);
            List<Person> list = Arrays.asList(person1, person2, person3);
            list.sort(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
            list.forEach(person -> {
                System.out.println(person.getFirstName() +" "+person.getLastName());
            });
        List<Person> people = Arrays.asList(person1, person2, person3);
        people.sort(Comparator.comparingInt(Person::getAge));
        for (Person person : people) {
            System.out.println(person.getFirstName() +" "+person.getLastName());
        }
    }
}
