package day2;

public class reversenumber {
    
    public static void main(String[] args) {
        int num = 12345; // Example number
        int reversed = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append the digit to the reversed number
            temp /= 10; // Remove the last digit
        }

        System.out.println("Reversed number of " + num + " is: " + reversed);
    }
}
