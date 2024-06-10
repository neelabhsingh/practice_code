package array;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int [] num = {-2, -1, 1, 2};
        int [] result = asteroidCollision(num);
        for(int data: result){
            System.out.print(data+ ",");
        }
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
           if(asteroid < 0){
               while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)){
                   stack.pop();
               }
               if(!stack.isEmpty() && stack.peek() > 0 && stack.peek() == Math.abs(asteroid)){
                   stack.pop();
               }else if(stack.isEmpty() || stack.peek() <0 ){
                   stack.push(asteroid);
               }
           }else{
               stack.push(asteroid);
           }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
