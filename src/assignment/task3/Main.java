package assignment.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of integers.
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

        integers.stream()
                .filter(i -> i % 2 == 0)        // 1. Filter out all even numbers.
                .map(i -> i + 5)                // 2. Increase each number by 5 (map).
                .forEach(System.out::println);  // 3. Print the result using forEach.
    }
}
