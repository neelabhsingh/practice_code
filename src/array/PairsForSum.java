package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairsForSum {
    public static void main(String[] args) {
        int [] nums =  {8,5,7,6,31,21};
        int sum = 13;
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).forEach(num ->{
            if(set.contains(num)){
                System.out.println("Pairs with give sum :"+ sum+"("+ num +", ("+ (sum - num)+")");
            }else{
                set.add(sum - num);
            }
        });
//        for(int num: nums){
//            if(set.contains(num)){
//                System.out.println("Num1:"+ num+", Num2:"+ (sum - num));
//                break;
//            }else{
//                set.add(sum - num);
//            }
//        }
    }
}
