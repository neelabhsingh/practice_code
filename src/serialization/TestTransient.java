package serialization;

import java.io.*;

class Employee implements Serializable{
    String name;
    transient String password;
    public Employee(String name, String password){
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee { name='" +name +"', password='" + password +"'}";
    }
}

public class TestTransient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("John Doe", "password123");
        FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);

        FileInputStream fileInputStream = new FileInputStream("employee.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee deserializedEmp = (Employee) objectInputStream.readObject();
        System.out.println("Before Serialized  Employee :"+ employee);
        System.out.println("After Deserialized Employee :"+ deserializedEmp);
    }



}
