package string.palindrome.longestsubstring;

import java.util.Scanner;

public class DynamicSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Test Cases:");
        int testCases = scan.nextInt();
        while (testCases -- > 0){
            System.out.println("Enter the input String");
            String str = scan.next();
            System.out.println(longestPalindrome(str));
        }
    }

    public static String longestPalindrome(String input){
        if(input == null || input.isEmpty()){
            return "";
        }
        int n = input.length();
        boolean [][] palindromeTable = initializePalindromicTable(n);
        int start = 0;
        int maxLength = 0;
        populatePalindromicTable(input, palindromeTable);
        int [] result  = findLongestPalindromicSubStringStartIndex(palindromeTable, maxLength);
        start = result[0];
        maxLength = result[1];
        return input.substring(start, start + maxLength);
    }
    private static boolean[][] initializePalindromicTable(int n){
        boolean [][] table = new boolean[n][n];
        for(int i =0; i< n; i++){
            table[i][i] = true;
        }
        return table;
    }
    private static void populatePalindromicTable(String input, boolean [][] table){
        int n = input.length();
        for(int len = 2; len <= n; len++){
            for(int start = 0; start < n - len +1; start++){
                int end = start + len - 1;
                table[start][end] = input.charAt(start) == input.charAt(end) && (len == 2 || table[start+1][end-1]);
            }
        }
    }
    private static int [] findLongestPalindromicSubStringStartIndex(boolean [][] table, int maxLength){
        int n = table.length;
        int start = 0;
        for(int len = n; len >= 1; len--){
            for(int i = 0; i + len - 1 < n; i++){
                if(table[i][i + len - 1]){
                    maxLength = len;
                    start = i;
                    break;
                }
            }
            if(maxLength == len){
                break;
            }
        }
        return new int[]{start, maxLength};
    }
}
