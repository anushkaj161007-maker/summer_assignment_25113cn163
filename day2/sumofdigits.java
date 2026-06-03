package day2;

public class sumofdigits {
    public static void main(String[] args) {
        int num = 12345; // Example number
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10; // Add the last digit to sum
            temp /= 10; // Remove the last digit
        }

        System.out.println("Sum of digits of " + num + " is: " + sum);
    }
}
