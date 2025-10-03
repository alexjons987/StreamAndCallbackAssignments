package assignment.task4;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 12),
                new Person("Bob", 13),
                new Person("Ethan", 55),
                new Person("Charlie", 27),
                new Person("Bobas", 28)
        );

        people.stream()
                .filter(person -> person.getAge() > 18)         // 1. Filter out people over 18.
                .sorted(Comparator.comparing(Person::getAge))   // 2. Sort them by age (ascending).
                .map(Person::getName)                           // 3. Extract only their names (map).
                .forEach(System.out::println);                  // 4. Print the names.
    }
}
