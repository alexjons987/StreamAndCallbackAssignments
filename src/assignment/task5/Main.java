package assignment.task5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of Double values representing product prices.
        List<Double> prices = List.of(
                8.35d,
                11.08d,
                11.51d,
                27.02d,
                28.64d,
                5.88d
        );

        // Use Stream with reduce to calculate the sum of all prices.
        Double total = prices.stream().reduce(0.0d, Double::sum); // .reduce(0.0d, (subtotal, element) -> subtotal + element)

        // Use another reduce to calculate the max price.
        Double highest = prices.stream().reduce(0.0d, (x, y) -> x > y ? x : y);

        System.out.printf("Total: %.2f Highest: %.2f", total, highest);
    }
}
