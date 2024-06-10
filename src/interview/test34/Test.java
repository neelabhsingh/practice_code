package interview.test34;

/*
Write a program by using java8 to sort the following Employee Hashmap by using Employee Address pincode.
 HaspMap: EmployeeMap =   [{1,Employee(1,Narasa,Address(Nellore,524234))},
 {2,Employee(2,Reddy,Address(Hyderabad,500050))},
 {3,Employee(3,Trayana,Address(Nellore,500001))},
 {4,Employee(4,Chandu,Address(Bangalore,521098))}]
 */

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
class Address{
    String city;
    int pincode;

    public Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeHashMap = new HashMap<>();

        employeeHashMap.put(1, new Employee(1,"Narasa", new Address("Nellore",524234)));
        employeeHashMap.put(2, new Employee(2,"Reddy", new Address("Hyderabad",500050)));
        employeeHashMap.put(3, new Employee(3,"Trayana", new Address("Nellore",500001)));
        employeeHashMap.put(4, new Employee(4,"Chandu", new Address("Bangalore",521098)));

        LinkedHashMap<Integer, Employee> sortedMap = employeeHashMap.entrySet().stream()
                .sorted(Comparator.comparing(e -> e.getValue().getAddress().getPincode()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new));
        System.out.println(sortedMap);
        sortedMap.entrySet().stream().forEach(entry -> System.out.println(entry.getValue().getName()));

//        HashMap<Integer, Employee> list = employeeHashMap.entrySet().stream()
//                .sorted(Comparator
//                        .comparing(entry -> entry.getValue()
//                                .getAddress().pincode)).collect(Collectors.toMap()

        String str = "Neelabh";

       // String result = str.chars().reduce("", (s, c) -> c + s);


        //select * from Employee where min(salary) = ( salect salary from employee where salary order desc limit 3)




    }
    public static  boolean isNumberStartWithOne(int num){
        while (num >0 || num <9){

            num = num/10;
        }
        return num == 1 ? true : false;
    }
}
