package day1;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        //program to find the factorial of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int factNum = sc.nextInt();
        int factorial = 1;
        for(int i=1; i<=factNum; i++){
            factorial *= i;
        }
        System.out.println("Factorial of "+factNum+" is: "+factorial);
        sc.close();
    }
}
