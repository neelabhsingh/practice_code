package interview1;

import java.util.HashMap;
import java.util.Map;

/**
 * [11:38 AM] Mukesh Balan
 * Find highest avg score.
 * String[][] scores = { { "Bunney", "81" }, { "Charles", "20" }, { "Remo", "87" }, { "Charles", "100" } };
 *       // Bunney - 81, Charles average is = 60, Remo = 87
 *
 *         //87 is the highest average score
 */

public class Main {
    public static void main(String[] args) {
        String[][] scores = { { "Bunney", "81" }, { "Charles", "20" }, { "Remo", "87" }, { "Charles", "100" },  { "Bunney", "100" },  { "Charles", "90" } };
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        for(int i = 0; i < scores.length; i++){
            String  name = scores[i][0];
            int score = Integer.parseInt(scores[i][1]);
            if(hashMap1.containsKey(name)){
                int tempScore = hashMap1.get(name);
                hashMap1.put(name, tempScore + score);
            }else{
                hashMap1.put(name, score);
            }
            if(hashMap2.containsKey(name)){
                int freq = hashMap2.get(name);
                hashMap2.put(name, freq +1);
            }else{
                hashMap2.put(name, 1);
            }
        }
        float maxAvgScore = Float.MIN_VALUE;
        System.out.println("Hashmap1"+ hashMap1);
        System.out.println("Hashmap2"+ hashMap2);
        for(Map.Entry<String, Integer> entry : hashMap2.entrySet()){
            int sumScore = hashMap1.get(entry.getKey());
            maxAvgScore = Math.max(maxAvgScore, sumScore /(float) entry.getValue());
        }
        System.out.println("Max Avg Score: "+ maxAvgScore);
    }
}
