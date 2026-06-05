package day5;
import java.util.Scanner;
public class factors_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        System.out.println("the factors of number "+n+" are: ");
        for(int i =1; i<n; i++){
            if(n%i ==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
