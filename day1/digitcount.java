package day1;
import java.util.Scanner;
public class digitcount {
    public static void main(String[] args) {
        //program to count digits of a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int digitNum = sc.nextInt();
        int count =0;
        if (digitNum==0){
            count=1;
        }
        while(digitNum != 0){
            digitNum /= 10;
            count++;
        }
        System.out.println("Number of digits is: "+count);
        sc.close();
    }
}
