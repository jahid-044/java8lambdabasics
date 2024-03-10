package io.javabrains.unit2;

import io.javabrains.unit1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Matthew","Arnold",39)
        );

        Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));

        System.out.println("Printing all the items: ");
        performConditionally(people, p -> true, p -> System.out.println(p));

        System.out.println("Printing items conditionally: ");
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getLastName()));

    }

    private static void performConditionally(List<Person> people,
                                             Predicate<Person> predicate,
                                             Consumer<Person> consumer) {
        for (Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
