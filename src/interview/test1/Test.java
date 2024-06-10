package interview.test1;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 int
* */
public class Test {
    public static void main(String[] args) {
        int [] nums1 = {12, 34, 45, 12, 34, 43};
        int [] nums2 = {43, 23, 12, 89, 1, 7};

        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len1 > len2){
            int [] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        for(int i = 0; i< 3; i++){
            if(i< nums1.length){
                int value = nums1[i];
                nums1[i] = nums2[i];
                nums2[i] = value;
            }
        }
        //Arrays.asList(nums1).forEach(System.out::println);
        IntStream.of(nums1).forEach(System.out::print);
        System.out.println(Arrays.toString(nums1));
    }
}
