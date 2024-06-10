package optional;
import java.util.Locale;
import java.util.Optional;

public class OptionalExample4 {
    public static void main(String[] args) {
        //1. Empty
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent()); //OUTPUT : false

        //2. of
        Optional<String> createOptionalByOf = Optional.of("CodeTechSummit");
        System.out.println(createOptionalByOf.get()); //OUTPUT: CodeTechSummit

        //3,4,5. ofNullable and get() isPresent()
        Optional<String> nullableOptional = Optional.ofNullable("CodeTechSummit");
        if(nullableOptional.isPresent()){
            System.out.println(nullableOptional.get()); //OUTPUT: CodeTechSummit
        }

        //6. ifPresent
        Optional<String> optionalPresent = Optional.of("CodeTechSummit");
        optionalPresent.ifPresent(value -> System.out.println(optionalPresent.get()));//OUTPUT: CodeTechSummit

        System.out.println("Testing second version of ifPresent if Optional is empty.");
        Optional<String> optionalNotPresent = Optional.empty();
        optionalNotPresent.ifPresent(value -> System.out.println(value)); // OUTPUT: NO OUTPUT

        //7.map
        Optional<String> optionalMap = Optional.ofNullable("codetechsummit");
        Optional<String> mappedOptional = optionalMap.map(value-> value.toUpperCase());
        if(mappedOptional.isPresent()){
            System.out.println(mappedOptional.get());
        }

        //7. map if Optional is NULL
        Optional<String> emptyMapOptional = Optional.empty();
        Optional<String> mappedOptionalEmpty = emptyMapOptional.map( value -> value.toUpperCase());
        if(mappedOptionalEmpty.isPresent()){
            System.out.println(mappedOptionalEmpty.get());
        }else{
            System.out.println("Value is Not Present"); //OUTPUT: Value is Not Present
        }

        //8. Need to add flatMap

        //9.

    }
}
