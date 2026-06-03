package day2;
public class productofdigit {
    public static void main(String[] args) {
        int num = 12345; // Example number
        int product = 1;
        int temp = num;

        while (temp > 0) {
            product *= temp % 10; // Multiply the last digit to product
            temp /= 10; // Remove the last digit
        }

        System.out.println("Product of digits of " + num + " is: " + product);
    }
}