package optional;

import java.util.Optional;

public class OptionalExample1 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 8");
        Optional<String> optional1 = Optional.empty();
        if(optional1.isPresent()){
            System.out.println("Value is present :"+ optional.get());
        }else{
            System.out.println("Value is not present.");
        }
        optional.ifPresent(System.out::println);
        String value = optional1.orElse("Default String");
        System.out.println("value:"+ value);
    }
}
