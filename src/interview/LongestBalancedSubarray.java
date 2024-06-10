package interview;

import java.util.*;
public class LongestBalancedSubarray {

    public static int findLongestBalancedSubarray(String str) {
        int maxLength = 0;
        int currentLength = 0;
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                currentLength++;
            } else if (!stack.isEmpty() && isMatchingClosingBracket(stack.peek(), ch)) {
                stack.pop();
                maxLength = Math.max(maxLength, currentLength);
                currentLength -= 2; // Decrement currentLength by 2 since a pair of brackets is balanced
            } else {
                // Ignore non-brace characters or unbalanced closing braces
                currentLength = 0;
                stack.clear();
            }
        }

        return maxLength;
    }

    private static boolean isMatchingClosingBracket(char openingBracket, char closingBracket) {
        return (openingBracket == '(' && closingBracket == ')') ||
                (openingBracket == '[' && closingBracket == ']') ||
                (openingBracket == '{' && closingBracket == '}');
    }

    public static void main(String[] args) {
        String str1 = "{}{}{()[]()";
        String str2 = "{}{}{()[](){}{}]]{}[]";
        String str3 = "{}{}(){}(){()[]()";

        System.out.println("Length of longest balanced subarray in '" + str1 + "' is: " + findLongestBalancedSubarray(str1));
        System.out.println("Length of longest balanced subarray in '" + str2 + "' is: " + findLongestBalancedSubarray(str2));
        System.out.println("Length of longest balanced subarray in '" + str3 + "' is: " + findLongestBalancedSubarray(str3));
    }
}

