import io.javabrains.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Chales","Dickens",60),
                new Person("Lewis","Carroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Matthew","Arnold",39)
        );

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(System.out::println);
    }
}
