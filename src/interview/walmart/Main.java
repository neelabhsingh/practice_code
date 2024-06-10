package interview.walmart;

import java.util.*;
import java.util.stream.Collectors;

/*
[ [2,3, 4], [1, 2] , [3, 2, 1, 0, 5] [1]], 3

[[3, 2, 1, 0, 5], [2, 3, 4], [1,2]]

[ [2,3, 4], [1, 2] , [3, 2, 1, 0, 5] [1]], 2

[3,2,1,0,5],  [2,3, 4]

Input: intervals = [[1,4],[7,10], [13, 20]], intervalToAdd= [2,5]
Output: [[1,5],[7,10], [13, 20]]
Test case1:
[[1, 10], [2, 3], [4, 5], [6,7]], [11, 12]

[1,10], [11, 12]

Test cass2:
[[1, 2][3,4][6, 21]] [4, 20]

[1, 21]

Test case2:
[[1,2], [2,3]] [3,4]
1, 4

Test case $4;

[[1, 4], [2, 6]], [7, 9]

[1, 6], [7, 9]


 [3,20] , [3, 5], [1,4]

 [1, 2] , [3, 5], [3, 20]

 int i = to i< list.size() -1

[1,2] [2, 4]

[1, 4]
 element[i]

 */

class Interval{
    private int startTime;
    private int endTime;

    public Interval(int startTime, int endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }
}
public class Main {
    public static void main(String[] args) {
        List<List<Integer>> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList<>(Arrays.asList(2,3, 4)));
        arrayList.add(new ArrayList<>(Arrays.asList(1,2)));
        arrayList.add(new ArrayList<>(Arrays.asList(3,2,1,0,5)));
        arrayList.add(new ArrayList<>(Arrays.asList(1)));

    }
    private static List<List<Integer>> getLargestList(List<List<Integer>> arrayList, int size){
       // List<List<Integer>> result = arrayList.stream().sorted((list1, list2) -> list2.size() - list1.size()).limit(size).collect(Collectors.toList());


        Collections.sort(arrayList, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.size() - o1.size();
            }
        }); // nlogn + n
        int count = size;
        List<List<Integer>> resultFinal = new ArrayList<>();
        Iterator<List<Integer>> iterator = arrayList.iterator();
        while (iterator.hasNext() && count-- >0){
            List<Integer> list1 = iterator.next();
            resultFinal.add(new ArrayList<>(list1));
        }
        return resultFinal;
    }
        private static List<List<Integer>> getNonOverlappingInterval( List<List<Integer>> list){
            Collections.sort(list, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    return o1.get(0) - o2.get(0);
                }
            });
            Stack<List<Integer>>  stack = new Stack<>();
            for(int i =0; i< list.size(); i++){
                if(stack.isEmpty() || list.get(i).get(0) > stack.peek().get(1)){
                    stack.push(list.get(i));
                }else{
                    List<Integer> topOfStack = stack.pop();
                    topOfStack.set(0, Integer.min(list.get(i).get(0), topOfStack.get(0)));
                    topOfStack.set(1, Integer.max(list.get(i).get(1), topOfStack.get(1)));
                    stack.push(topOfStack);
                }
            }
            return stack.stream().collect(Collectors.toList());

        }
}
