package finallyreturn;

public class ExecutionOrder {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try");
            System.exit(0);
        }catch (Exception e){
            System.out.println("Inside catch");
        }finally {
            System.out.println("Inside finally");
        }
    }
}
