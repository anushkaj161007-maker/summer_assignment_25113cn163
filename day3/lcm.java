package day3;

public class lcm {
    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 20;
        int lcm=1;
        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break; // Found the LCM
            }
            lcm++; // Increment to check the next number
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    
}
