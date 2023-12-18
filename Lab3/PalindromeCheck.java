package Lab3;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti cuvantul pentru verificare palindrom: ");
        String word = scanner.nextLine();
        scanner.close();

        if (isPalindrome(word)) {
            System.out.println("Cuvantul este palindrom.");
        } else {
            System.out.println("Cuvantul nu este palindrom.");
        }
    }

    private static boolean isPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}