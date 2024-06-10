package interview;

import java.util.Stack;

public class BalancedSubstring {

    /**
     * Finds the length of the longest balanced substring in the given string.
     *
     * @param str The input string containing brackets.
     * @return The length of the longest balanced substring.
     */
    public static int findLongestBalancedSubstring(String str) {
        Stack<Character> stack = new Stack<>();
        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // If the current character is an opening bracket, push it onto the stack.
            if (isOpeningBracket(c)) {
                stack.push(c);
            } else {
                // If the current character is a closing bracket...
                if (stack.isEmpty() || !isMatchingClosingBracket(stack.peek(), c)) {
                    // If the stack is empty or the closing bracket doesn't match the top of the stack,
                    // reset the start index and clear the stack.
                    start = i + 1;
                    stack.clear();
                } else {
                    // If the closing bracket matches the top of the stack,
                    // pop the corresponding opening bracket from the stack.
                    stack.pop();

                    // Update the maximum length if the current substring is longer than the previous maximum.
                    // We use i - start + 1 instead of i - start because the length should be inclusive of both start and end indices.
                    maxLength = Math.max(maxLength, i - start + 1);
                }
            }
        }

        return maxLength;
    }

    /**
     * Checks if the given character is an opening bracket.
     *
     * @param c The character to check.
     * @return True if the character is an opening bracket, false otherwise.
     */
    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    /**
     * Checks if the given closing bracket matches the top of the stack.
     *
     * @param top The top element of the stack.
     * @param c   The closing bracket to check.
     * @return True if the closing bracket matches the top of the stack, false otherwise.
     */
    private static boolean isMatchingClosingBracket(char top, char c) {
        return (c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{');
    }

    public static void main(String[] args) {
        System.out.println(findLongestBalancedSubstring("{}{}{()[]()"));      // Output: 6
        System.out.println(findLongestBalancedSubstring("{}{}{()[](){}{}]]{}[]")); // Output: 10
        System.out.println(findLongestBalancedSubstring("{}{}(){}(){()[]()"));  // Output: 10
    }
}
