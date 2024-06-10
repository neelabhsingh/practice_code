package interview.walmart;


class Singleton{
    public static Singleton singleton = null;
    private Singleton(){
        if(singleton != null){
            throw new RuntimeException("Alread ");
        }
        System.out.println("This is Singleton Design Pattern");
    }
    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized(Singleton.class) {
                if(singleton == null){
                    singleton = new Singleton();
                }

            }
        }
        return singleton;
    }
}

public class Test {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();

        System.out.println(singleton1.hashCode());
    }
}
