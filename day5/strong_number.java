package day5;
import java.util.Scanner;
public class strong_number {
    static int factorial( int a){
        int fact = 1;
        for(int i=1; i<=a; i++){
            fact*=i;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum = sum + factorial( r);
            n/=10;
        }
        if(temp==sum){
            System.out.println("the number " + temp+ " is strong.");  
        }
        else{
            System.out.println("the number " + temp+ " is not strong.");
        }
        sc.close();
    }
}
