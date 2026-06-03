package day3;

public class primeornot {
    public static void main(String[]args){
        int num = 29;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor, not a prime number
                    break;
                }
            }
        }
        System.out.println(num + " is " + (isPrime ? "" : "not ") + "a prime number.");
    }
}
