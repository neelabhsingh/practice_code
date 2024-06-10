public class SingletonDemo {
    private static SingletonDemo instance;
    private SingletonDemo(){
        System.out.println("Singleton Demo");
    }
    public static SingletonDemo getInstance(){
        if(instance == null){
            instance = new SingletonDemo();
        }
        return instance;
    }
}
