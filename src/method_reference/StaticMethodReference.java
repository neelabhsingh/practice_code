package method_reference;

import java.util.Arrays;

public class StaticMethodReference {
    public static void main(String[] args) {
        int [] numbers = {3, 1, 4, 1, 5, 9};
        int maxValue =Arrays.stream(numbers).max().orElse(0);
        System.out.println("Max Value "+ maxValue);
    }
}
