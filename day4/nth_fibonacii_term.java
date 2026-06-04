package day4;
import java.util.Scanner;
public class nth_fibonacii_term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b = 1;
        int c;
        
        for(int i =1;i<n; i++){

            c=a+b;
            a=b;
            b=c;   
        }
        System.out.println("the "+ n + " term of fibonacci series is: " + a);
        sc.close();
    }
}
