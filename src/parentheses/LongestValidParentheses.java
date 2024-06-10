package parentheses;



import java.util.*;
public class LongestValidParentheses {
    public static void main(String[] args) {
        String str1 = "{}{}{()[]()";
        String str2 = "{}{}{()[](){}{}]]{}[]";
        String str3 = "{}{}(){}(){()[]()";
        System.out.println("Length of longest balanced subarray in '" + str1 + "' is: " + longestValidParentheses(str1));
        System.out.println("Length of longest balanced subarray in '" + str2 + "' is: " + longestValidParentheses(str2));
        System.out.println("Length of longest balanced subarray in '" + str3 + "' is: " + longestValidParentheses(str3));
    }
    public static int longestValidParentheses(String s) {
        int maxLength =0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0; i< s.length(); i++){
            char parentheses = s.charAt(i);
            if( parentheses == '(' || parentheses == '[' || parentheses == '{' ){
                stack.push(i);
            }else{
                if(stack.isEmpty() || stack.peek() != -1 && !matchingParentheses(s.charAt(stack.peek()), parentheses )){
                    stack.push(i);
                }else{
                    stack.pop();
                    if(stack.isEmpty()){
                        stack.push(i);
                    }else{
                        maxLength = Math.max(maxLength, i- stack.peek() );
                    }

                }
            }
        }
        return maxLength;
    }
    public static boolean matchingParentheses(char left, char right){
        if ( (left == '(' && right == ')') || (left == '[' && right == ']') || (left == '{' && right == '}') ){
            return true;
        }
        return false;

    }
}