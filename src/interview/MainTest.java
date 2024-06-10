package interview;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

/*
int[] a = new int[]{-5,-3,1,4,5}
int[] b = {-7,3,5,6}
 */
public class MainTest {
    public static void main(String[] args) {
        int [] num1 = {-5,-3,1,4,5};
        int [] num = {-7,3,5,6};
//        for(int i=0; i< num.length; i++){
//            if()
//        }
        int i= 0, j = num.length -1;
        boolean isPairExit = false;
        while (i<j){
            if(num[i] + num[j] == 0){
                System.out.println("There are two element whose sum is zero.");
                isPairExit = true;
                break;
            }
            if(num[i] + num[j] > 0){
                j--;
            }else{
                i++;
            }
        }
        if(!isPairExit) {
            System.out.println("There is no pairs with sum zero.");
        }
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = list.stream().filter(num2 -> num2 % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
