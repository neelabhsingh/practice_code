package optional;

import java.util.Optional;

public class OptionalExample5 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello World");
        optional.map(String::toUpperCase).ifPresent(System.out::println);
        Optional<String> optional2 = Optional.of("123");
        optional2.flatMap( s -> {
            try{
                int parseInt = Integer.parseInt(s);
                return Optional.of(parseInt);
            }catch(NumberFormatException ex){
                return Optional.empty();
            }
        }).ifPresent(System.out::println);
    }
}
