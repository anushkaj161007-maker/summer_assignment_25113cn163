package day12;

import java.util.Scanner;

public class armstrong {
    public static boolean armstrong_num(int n){
        int temp = n;
        int r =0;
        int sum =0;
        boolean arm = false;
        while(temp>0){
            r=temp%10;
            sum += r*r*r;
            temp = temp/10;
        }
        if(n == sum){
            arm = true;
        }
        return arm;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.print("is number armstrong? " + armstrong_num(a));

        sc.close();
    }
}
