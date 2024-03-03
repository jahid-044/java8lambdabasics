package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Matthew","Arnold",39)
        );

        Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));

        System.out.println("Printing all the items: ");
        printConditionally(people, p -> true);

        System.out.println("Printing items conditionally: ");
        printConditionally(people, p -> p.getLastName().startsWith("C"));

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }
}
