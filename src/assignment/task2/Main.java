package assignment.task2;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        int number = 10;

        // 1. Multiply the number by 2.
        System.out.println(processNumber(number, num -> num * 2));

        // 2. Square the number.
        System.out.println(processNumber(number, num -> num * num));

        // 3. Add 10 to the number.
        System.out.println(processNumber(number, num -> num + 10));
    }

    public static int processNumber(int number, Function<Integer, Integer> callback) {
        return callback.apply(number);
    }
}
