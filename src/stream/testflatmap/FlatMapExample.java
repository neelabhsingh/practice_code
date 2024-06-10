package stream.testflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Customer{
    int id;
    String name;
    List<Order> orders;
    Customer(int id, String name, List<Order> orders){
        this.id = id;
        this.name = name;
        this.orders = orders;
    }
}
class Order{
    int id;
    double amount;
    Order(int id, double amount){
        this.id = id;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "[Id:"+ id + ",amount"+ amount+"], ";
    }
}

public class FlatMapExample {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "John",
                Arrays.asList(new Order(101, 250),
                        new Order(102, 175)));
        Customer customer2 = new Customer(2, "John",
                Arrays.asList(new Order(201, 250),
                        new Order(202, 175),
                        new Order(203, 62.5)));
        List<Customer> customers = Arrays.asList(customer1, customer2);
        List<Order> allOrders = customers.stream().flatMap(order ->order.orders.stream()).collect(Collectors.toList());
        System.out.println(allOrders);
        List<Integer> orderIds = customers.stream().flatMap(customer -> customer.orders.stream().map(order -> order.id)).collect(Collectors.toList());
        System.out.println(orderIds);
    }
}
