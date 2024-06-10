package Collection.vector;

import java.util.Vector;

public class VectorCapacityExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        System.out.println("Initial capacity: " + vector.capacity()); // Output: Initial capacity: 10

        // Add elements until capacity is exceeded
        for (int i = 0; i < 15; i++) {
            vector.add(i);
        }

        System.out.println("Capacity after adding 15 elements: " + vector.capacity()); // Output: Capacity after adding 15 elements: 20
    }
}