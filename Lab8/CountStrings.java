package Lab8;

import java.util.Arrays;
import java.util.List;

public class CountStrings  {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> words = Arrays.asList("ananas", "avocado", "argon", "pere", "mere", "struguri");

        // Specific letter to count strings starting with
        char specificLetter = 'a';

        // Count strings starting with the specific letter
        long count = words.stream()
                .filter(word -> word.startsWith(String.valueOf(specificLetter)))
                .count();

        // Display the result
        System.out.println("De cate ori '" + specificLetter + "': " + count);
    }
}
