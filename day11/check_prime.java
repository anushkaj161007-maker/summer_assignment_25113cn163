package day11;

import java.util.Scanner;

public class check_prime {
    public static boolean prime(int a){
        Boolean prime = true;
        for(int i =2; i<a; i++){
            if(a%i==0){
                prime = false;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.println("prime? " + prime(a));

        sc.close();
    }
}
