package algo.CombinationSum;
import java.util.*;

public class CombinationSum {
    public static void main(String [] args){
        int [] array = {1,2,3,4,5};
        int sum = 4;
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backtracking(array, 0, sum, path, result);
        System.out.println(result);
    }
    private static void backtracking(int [] array, int start, int remain, List<Integer> path, List<List<Integer>> result){
        if(remain == 0){
            result.add(new ArrayList<>(path));
        }else {
            for(int i=start; i< array.length; i++){
                if(array[i] > remain){
                    continue;
                }
                path.add(array[i]);
                backtracking(array, i, remain - array[i], path, result);
                path.remove(path.size() -1);
            }
        }
    }

}
