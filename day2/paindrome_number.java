package day2;

public class paindrome_number {
    public static void main(String[] args) {
        int num = 12321; // Example number
        int reversed = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            temp /= 10; // Remove the last digit
        }

        if (num == reversed) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
