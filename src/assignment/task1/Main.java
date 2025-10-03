package assignment.task1;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // 1. Print the string in uppercase.
        processString("Alexander", string -> System.out.println(string.toUpperCase()));

        // 2. Print the number of characters in the string.
        processString("ThisIsAVeryLongStringOMG!", string -> System.out.println(string.length()));
    }

    public static void processString(String input, Consumer<String> callback) {
        callback.accept(input);
    }
}
