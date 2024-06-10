package interview;

import java.util.Scanner;
import java.util.Stack;

/**
 You have given a string that contains the braces (brackets), both opening and closing braces. You have to find the length of the longest balanced subarray.

 Input : {}{}{()[]()
 Output: 6
 Input : {}{}{()[](){}{}]]{}[]
 Output: 10
 Input : {}{}(){}(){()[]()
 Output: 10
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int testCases = Integer.parseInt(str);
        while (testCases-->0){
            System.out.println("Enter the parenthesis");
            String parenthesis = scanner.next();
            System.out.print("Length of the longest balanced sub array: ");
            System.out.println(findLongestBalancedSubarray(parenthesis));
        }
    }
    public static int findLongestBalancedSubarray(String str) {
        int maxLength = 0;
        int currentLength = 0;
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                currentLength++;
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
                maxLength = Math.max(maxLength, currentLength);
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
                maxLength = Math.max(maxLength, currentLength);
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
                maxLength = Math.max(maxLength, currentLength);
            } else {
                // Ignore non-brace characters or unbalanced closing braces
                currentLength = 0;
                stack.clear();
            }
        }

        return maxLength;
    }

}
