package exception;

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("Main");
        } catch (ClassNotFoundException e) {

        }
    }
}
