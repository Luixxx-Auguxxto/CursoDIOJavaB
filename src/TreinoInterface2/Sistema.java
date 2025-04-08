package TreinoInterface2;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Sistema {
    public static void main(String[] args) {
        List<User>  users = List.of(new User("Maria", 21), new User("João", 32),
            new User("Eduardo", 40), new User("Anna", 19));

        //users.forEach(System.out::println);
        //printStringValue(user -> String.valueOf(user.age()), users);
        printStringValue(Record::toString, users);
    }
    private static void printStringValue(Function<User, String> callback, List<User> users){
        users.forEach(u -> System.out.println(callback.apply(u)));
    }


}
