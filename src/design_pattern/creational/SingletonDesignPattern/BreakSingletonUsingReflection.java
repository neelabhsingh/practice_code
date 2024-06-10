package design_pattern.creational.SingletonDesignPattern;

import java.lang.reflect.Constructor;

class Singleton{
    public static Singleton singletonInstance = null;
    private Singleton(){
        if(singletonInstance != null){
            throw new RuntimeException("Singleton Object is already created.");
        }
        System.out.println("Singleton Object");
    }
    public static Singleton getSingletonInstance(){
        if(singletonInstance == null){
            return singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}

public class BreakSingletonUsingReflection{
    public static void main(String [] args){
        Singleton singletonInstance1 = Singleton.getSingletonInstance();
        Singleton singletonInstance2 = null;
        try{
            Constructor [] constructors = Singleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                constructor.setAccessible(true);
                singletonInstance2 = (Singleton) constructor.newInstance();
                break;
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println("singletonInstance1 hashCode : " + singletonInstance1.hashCode());
        System.out.println("singletonInstance2 hashCode : " + singletonInstance2.hashCode());
    }
}
