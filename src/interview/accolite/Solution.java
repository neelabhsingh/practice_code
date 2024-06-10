package interview.accolite;

//Find the second largest element in an array without sorting, without internal methods and at max single loop?
public class Solution {
    public static void main(String[] args) {
        int [] array = {2,3,19, 17, 20, 7, 16};
        System.out.println(getSecondLargestElement(array));
    }
    //max1 = 2,max2=2, max1=3, max2=2, max1=19, max2= 3
    public static int getSecondLargestElement(int [] nums){
        int maxValue1 = Integer.MIN_VALUE;;
        int maxValue2 = Integer.MIN_VALUE;
        for(int i=0; i< nums.length; i++){
            if(nums[i]> maxValue1){
                maxValue2 = maxValue1;
                maxValue1 = nums[i];
            }else if(nums[i]> maxValue2){
                maxValue2 = nums[i];
            }
        }
        return maxValue2;
    }
}
