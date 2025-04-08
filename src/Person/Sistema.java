package Person;

public class Sistema {
    public static void main(String[] args) {
        var person = new Person("João", 12);

        System.out.println(person.name());
        System.out.println(person.age());

        var newPerson = new Person(person.name(), 19);
    }
}
