package interview;
import java.util.Stack;
/**
 You have given a string that contains the braces (brackets), both opening and closing braces. You have to find the length of the longest balanced subarray.

 Input : {}{}{()[]()
 Output: 6
 Input : {}{}{()[](){}{}]]{}[]
 Output: 10
 Input : {}{}(){}(){()[]()
 Output: 10
 * Solution to find the length of the longest balanced substring within a given string containing various types of brackets.
 *
 * Time Complexity: O(n), where n is the length of the input string.
 * Space Complexity: O(n) in the worst case, when all brackets are unbalanced.
 *
 * @author [Neelabh Singh]
 */
public class LongestBalancedSubstring {

    /**
     * Finds the length of the longest balanced substring in the given string.
     *
     * @param s The input string containing brackets.
     * @return The length of the longest balanced substring.
     */
    public static int longestBalancedSubarray(String s) {
        int maxLength = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Push a dummy index to handle the case when the whole string is balanced

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is an opening bracket, push its index onto the stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(i);
            } else {
                // If the stack is empty or the current closing bracket doesn't match the top of the stack
                if (stack.isEmpty() || !isMatchingClosingBracket(stack.peek(), c)) {
                    stack.push(i); // Push the index of the unbalanced closing bracket
                } else {
                    // If the current closing bracket matches the top of the stack
                    stack.pop(); // Pop the corresponding opening bracket index

                    // If the stack becomes empty after popping, it means we have found a balanced substring
                    if (stack.isEmpty()) {
                        stack.push(i); // Push the index of the balanced closing bracket
                    } else {
                        // Update maxLength with the length of the balanced substring found
                        maxLength = Math.max(maxLength, i - stack.peek());
                    }
                }
            }
        }

        // Handle the remaining unbalanced brackets in the stack
        while (stack.size() > 1) {
            int start = stack.pop(); // Pop the start index of an unbalanced substring
            int end = stack.pop(); // Pop the end index of an unbalanced substring
            maxLength = Math.max(maxLength, end - start); // Update maxLength with the length of the unbalanced substring
        }

        return maxLength;
    }

    private static boolean isMatchingClosingBracket(int openingBracketIndex, char closingBracket) {
        char openingBracket = s.charAt(openingBracketIndex);
        return (openingBracket == '(' && closingBracket == ')') ||
                (openingBracket == '[' && closingBracket == ']') ||
                (openingBracket == '{' && closingBracket == '}');
    }

    private static String s; // Declare s as a class-level variable

    public static void main(String[] args) {
        String str1 = "{}{}{()[]()";
        String str2 = "{}{}{()[](){}{}]]{}[]";
        String str3 = "{}{}(){}(){()[]()";

        s = str1; // Assign str1 to s
        System.out.println("Length of longest balanced subarray in '" + str1 + "' is: " + longestBalancedSubarray(str1));

        s = str2; // Assign str2 to s
        System.out.println("Length of longest balanced subarray in '" + str2 + "' is: " + longestBalancedSubarray(str2));

        s = str3; // Assign str3 to s
        System.out.println("Length of longest balanced subarray in '" + str3 + "' is: " + longestBalancedSubarray(str3));
    }
}