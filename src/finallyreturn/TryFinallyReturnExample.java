package finallyreturn;

public class TryFinallyReturnExample {
    public static void main(String[] args) {
        int result = test();
        System.out.println("Result:" + result);
    }
    public static int test(){
        try {
            System.out.println("Inside try block");
            return 10;
        }catch (Exception e){
            System.out.println("Inside catch block");
            return 20;
        }finally {
            System.out.println("Inside finally block.");
            return 30;
        }
    }
}
