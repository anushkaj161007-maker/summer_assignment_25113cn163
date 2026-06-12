package day12;

import java.util.Scanner;

public class palindrome {
    public static boolean palindrome_num(int a){
        int temp = a;
        boolean pal = false;
        int rev =0;
        while(temp>0){
            int r = temp%10;
            rev = rev*10+r;
            temp = temp/10;
        }
        if(rev == a){
            pal = true;
        }
        return pal;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.print("palindrome? " + palindrome_num(a));

        sc.close();
    }
}
