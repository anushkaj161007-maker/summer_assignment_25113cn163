package day5;
import java.util.Scanner;

public class largest_prime_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largestPrimeFactor = 1;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                largestPrimeFactor = i;
                n /= i;
            }
        }

        if (n > 1) {
            largestPrimeFactor = n;
        }

        System.out.println("Largest Prime Factor: " + largestPrimeFactor);

        sc.close();
    }
}
