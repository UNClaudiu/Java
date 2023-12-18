package Lab3;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti N pentru sirul Fibonacci: ");
        int n = scanner.nextInt();
        scanner.close();

        printFibonacciSeries(n);
    }

    private static void printFibonacciSeries(int n) {
        int a = 0, b = 1;

        System.out.print("Sirul Fibonacci pana la " + n + ": ");
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
