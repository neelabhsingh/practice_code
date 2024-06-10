package optional;

import java.util.Optional;
import java.util.Map;
import java.util.HashMap;
class User{
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class OptionalExample3 {
    private static Map<String, User> users = new HashMap<>();
    static {
        users.put("123", new User(123, "Neelabh"));
        users.put("124", new User(124, "Sushama"));
    }
    public static Optional<User> findUserById(String id){
        return Optional.ofNullable(users.get(id));
    }
    public static void main(String[] args) {
        findUserById("124").ifPresent(user -> System.out.println(user.getName()));
        findUserById("123").ifPresentOrElse(
                user-> System.out.println(user.getName()), () ->System.out.println("User not found"));
        findUserById("345").ifPresentOrElse(
                user -> System.out.println(user.getName()), () -> System.out.println("User not found"));
    }
}
