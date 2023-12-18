package Lab4;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 254;
        int sum = calculateSumOfDigits(number);
        System.out.println("Suma cifrelor este: " + sum);
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}