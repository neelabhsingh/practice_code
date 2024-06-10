package algo.backtracking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AllPermutations {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        List<List<Integer>>  result = permute(nums);
        Iterator<List<Integer>> itr = result.iterator();
        while (itr.hasNext()){
            Iterator<Integer> itrnested = itr.next().iterator();
            while (itrnested.hasNext()){
                System.out.print(itrnested.next()+", ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> permute(int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        boolean [] visited = new boolean[nums.length];
        permute(nums, result, visited, new ArrayList<>());
        return result;
    }

    public static void permute(int [] nums, List<List<Integer>> result, boolean []visited, List<Integer> temp){
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!visited[i]){
                temp.add(nums[i]);
                visited[i] =true;
                permute(nums,result, visited, temp);
                temp.remove(temp.size() -1);
                visited[i] =false;
            }
        }
    }
}
