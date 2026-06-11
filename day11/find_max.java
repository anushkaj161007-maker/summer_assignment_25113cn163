package day11;

import java.util.Scanner;

public class find_max {
    public static int max (int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("max = " + max(a, b));

        sc.close();
    }
}
