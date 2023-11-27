package Lab8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {
        // Sample list of integers
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3, 7, 4, 6);

        // Sort in ascending order using streams
        List<Integer> ascendingOrder = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        // Sort in descending order using streams
        List<Integer> descendingOrder = numbers.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        // Display the results
        System.out.println("Original list: " + numbers);
        System.out.println("Sorted in ascending order: " + ascendingOrder);
        System.out.println("Sorted in descending order: " + descendingOrder);
    }
}
