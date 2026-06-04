package day4;
import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number;
        int r =0;
        int sum =0;
        while(temp>0){
            r=temp%10;
            sum += r*r*r;
            temp = temp/10;
        }
        if(number == sum){
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("the number is not armstrong");
        }
        sc.close();

    }
}
