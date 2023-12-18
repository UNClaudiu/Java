package Lab3;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 5, 8, 11, 13, 17, 20, 23, 29);
        List<Integer> primeNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }

        System.out.println(primeNumbers);
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}