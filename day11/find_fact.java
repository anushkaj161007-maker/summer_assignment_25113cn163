package day11;

import java.util.Scanner;

public class find_fact {
    public static int fact(int a){
        int factorial =1;
        for(int i=1; i<=a; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.println("Factorial of "+ a+ " is " + fact(a));

        sc.close();
    }
}
