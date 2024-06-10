package string.palindrome.longestsubstring;

import java.util.Scanner;

public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases -- > 0){
            String str = scan.next();
            System.out.println(longestPalindrome(str));
        }
    }
    public static String longestPalindrome(String s){
        if( s == null || s.length() < 1){
            return "";
        }
        int maxLength =0;
        int startIndex = 0;
        for(int i=0; i<s.length() ;i++){
            for(int j = i+1; j <=s.length(); j++){
                String subString = s.substring(i, j);
                if(isPalindrome(subString)){
                    if(maxLength < j - i){
                        maxLength = j - i;
                        startIndex = i;
                    }
                }
            }
        }
        return s.substring(startIndex, startIndex + maxLength);
    }

    private static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() -1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
