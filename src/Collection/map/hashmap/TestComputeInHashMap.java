package Collection.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Employee{
    int id;
    int salary;
}

public class TestComputeInHashMap{
    public static void main(String [] args){
        Map<Integer, Double> employeesMap = new HashMap<>();
        employeesMap.put(100, 1000D);
        employeesMap.put(101, 2000D);
        employeesMap.put(102, 3000D);
        employeesMap.put(103, 4000D);
        //
        //
        // employeesMap.compute(100, (key, value) -> value + 10);
        Iterator<Integer> itr = employeesMap.keySet().iterator();

        employeesMap.forEach( (id, salary) ->{
            if(id < 101){
                employeesMap.compute(id, (key, val) -> val + 0.10 * val);
            }else{
                employeesMap.compute(id, (key, val) -> val + 0.05 * val);
            }
        });
        while(itr.hasNext()){
            int id = itr.next();
            System.out.println("Id :" + id +"Salary :"+ employeesMap.get(id));
        }

    }
}