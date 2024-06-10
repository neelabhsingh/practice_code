package design_pattern.creational.prototype.demo1;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, Prototype> prototypes = new HashMap<>();
    public static Prototype getInstance(String type) throws CloneNotSupportedException{
        Prototype prototype = prototypes.get(type);
        return prototype.clone();
    }
    public static void addPrototype(String type, Prototype prototype) {
        prototypes.put(type, prototype);
    }
}
