public class MiddleCharacter {
    public static void main(String[] args) {
        String input = "masina";
        printMiddleCharacters(input);
    }

    private static void printMiddleCharacters(String word) {
        int length = word.length();
        if (length % 2 == 0) {
            // Cuvant cu numar par de litere
            int mid = length / 2;
            System.out.println(word.substring(mid - 1, mid + 1));
        } else {
            // Cuvant cu numar impar de litere
            int mid = length / 2;
            System.out.println(word.charAt(mid));
        }
    }
}