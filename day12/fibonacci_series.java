package day12;

import java.util.Scanner;

public class fibonacci_series {
    public static int fibonacci(int n){
        int a =0;
        int b =1;
        int c;
        System.out.println("fibonacci series is: \n");
        for(int i =1;i<=n; i++){
            System.out.println(a);;
            c=a+b;
            a=b;
            b=c;   
        }
        return 0;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.print(fibonacci(a));

        sc.close();
    }
}
