package interview.gs;

import java.util.HashMap;

public class DecimalCycle {
    public static void main(String[] args) {
        System.out.println(vulgarToDecimal(1,7));
    }
    public static String vulgarToDecimal(long numerator, long denominator){
        long whileNumber = numerator / denominator;
        long remainder =numerator % denominator;
        StringBuilder stringBuilder = new StringBuilder();
        HashMap<Long, Integer> remainderMap = new HashMap<>();
        while (remainder > 0){
            if(remainderMap.containsKey(remainder)){
                int cycleStart = remainderMap.get(remainder);
                stringBuilder.insert(cycleStart, "(");
                stringBuilder.append(")");
                break;
            }
            remainderMap.put(remainder, stringBuilder.length());
            remainder *= 10;
            stringBuilder.append(remainder/denominator);
            remainder = remainder % denominator;
        }
        String decimalPart = stringBuilder.toString();
        if(decimalPart.isEmpty()){
            decimalPart = "0";
        }
        return whileNumber +"."+decimalPart;
    }
}
