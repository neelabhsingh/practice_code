package Collection.arraylist;

import java.util.ArrayList;

public class ArrayListCapacityExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Initial capacity: " + arrayList.size()); // Output: Initial capacity: 0

        // Add elements until capacity is exceeded
        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }

        System.out.println("Capacity after adding 15 elements: " + arrayList.size()); // Output: Capacity after adding 15 elements: 16
    }
}