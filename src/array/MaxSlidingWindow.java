package array;

import java.util.PriorityQueue;

public class MaxSlidingWindow {
    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int [] result = maxSlidingWindow(nums, k);
        for(int num: result){
            System.out.print(num+", ");
        }
    }
    public static int[] maxSlidingWindow1(int[] nums, int k) {
        int [] result = new int [nums.length - k +1];
        PriorityQueue<Integer> priorityQueueIndexBased = new PriorityQueue<>(
                (index1, index2) ->  nums[index1] != nums[index2] ?
                        Integer.compare(nums[index2], nums[index1]) : Integer.compare(index2, index1));

        for(int i=0; i< nums.length; i++){
            while (!priorityQueueIndexBased.isEmpty() && priorityQueueIndexBased.peek() <= i - k){
                priorityQueueIndexBased.poll();
            }
            priorityQueueIndexBased.offer(i);
            if(i >= k-1){
                result[i - k +1] = nums[priorityQueueIndexBased.peek()];
            }
        }
        return result;
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int [] result = new int [nums.length - k +1];
        PriorityQueue<Integer> priorityQueueIndexBased = new PriorityQueue<>(
                (index1, index2) -> nums[index1] != nums[index2] ?
                        Integer.compare(nums[index2], nums[index1]) : Integer.compare(index2, index1));
        int i=0;
        int count = 0;
        for(;  i< 3; i++){
            priorityQueueIndexBased.offer(i);
        }
        result[count++] = nums[priorityQueueIndexBased.peek()];
        for(; i< nums.length; i++){
            int queueIndex = priorityQueueIndexBased.peek();
            while( !priorityQueueIndexBased.isEmpty() && priorityQueueIndexBased.peek() <=i -k){
                priorityQueueIndexBased.poll();
            }
            priorityQueueIndexBased.offer(i);
            result[count++] = nums[priorityQueueIndexBased.peek()];
        }
        return result;
    }
}
