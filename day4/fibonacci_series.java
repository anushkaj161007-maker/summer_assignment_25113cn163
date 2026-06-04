package day4;
import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b =1;
        int c;
        System.out.println("fibonacci series is: \n");
        for(int i =1;i<=n; i++){
            System.out.println(a + " ");
            c=a+b;
            a=b;
            b=c;   
        }
        sc.close();
        
    }
    
}