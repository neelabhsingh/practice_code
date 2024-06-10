package interview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//1, 2, 3, 4, 5, 6, 7, 8, 9
//0, 1, 2, 3, 4, 5, 6, 7, 8
//3 % 8 == 3
//9 %  8 ==1
public class AltimetrikTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));    //7, 8, 9, 1, 2, 3, 4, 5, 6

        int numberOfRotation =  3;

        numberOfRotation = 3 % list.size();
        for(int i=0; i< numberOfRotation; ){
            int j = (i+ numberOfRotation) % list.size();
            int data = list.get(i);
            while (i != j){
                int tempData  = list.get(j);
                list.set(j, data);
                j = (i+ numberOfRotation) % list.size();
                data = tempData;

            }
            if(i ==j) {
                list.set(i, data);
            }
            i++;
        }
        list.stream().forEach(System.out::println);
    }
}
