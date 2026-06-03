package day3;

public class primeInRange {
    public static void main(String[] args) {
        int lowerBound = 10; // Example lower bound
        int upperBound = 50; // Example upper bound
        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // Print a new line at the end
    }
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a divisor, not a prime number
            }
        }
        return true; // No divisors found, it's a prime number
    }
}
