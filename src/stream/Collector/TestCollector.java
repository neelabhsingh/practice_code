package stream.Collector;

import java.util.List;
import java.util.stream.Collector;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Map;

class Person{
    private String name;
    private int age;
    private Double salary;

    public Person(String name, int age, Double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public Double getSalary(){
        return this.salary;
    }
    public int getAge(){
        return this.age;
    }
}
public class TestCollector{
    public static void main(String [] args){
        List<Person> poeple = Arrays.asList(
                new Person("Alice", 25, 50000D),
                new Person("Bob", 30, 60000D),
                new Person("Charlie", 35, 70000D),
                new Person("David", 40, 80000D),
                new Person("Eve", 45, 90000D),
                new Person("Alice", 25, 55000D)
        );

        //ToList
        List<String> names =poeple.stream()
                            .map(Person::getName).collect(Collectors.toList());
        System.out.println(names); //OUTPUT: [Alice, Bob, Charlie, David, Eve, Alice]

        //ToSet
        Set<String> uniqueName = poeple.stream().map(Person::getName).collect(Collectors.toSet());
        System.out.println(uniqueName);//OUTPUT:[Bob, Eve, Alice, Charlie, David]

        //ToMap
        Map<String, Double> namesToSalaries = poeple.stream()
                                                .collect(Collectors.toMap(
                                                                Person::getName,
                                                                Person::getSalary, (existingSalary, newSalary)-> newSalary));
        System.out.println(namesToSalaries);

        //Grouping By
        Map<Integer, List<Person>> peopleAge = poeple.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(peopleAge);

        //Joining By
        String namesCommaSeparated = poeple.stream().map(Person::getName).collect(Collectors.joining(","));
        System.out.println(namesCommaSeparated);



    }
}