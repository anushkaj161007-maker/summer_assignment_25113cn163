package day5;
import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1; i<=n/2; i++){
            if(n%i ==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("the number " + n+ " is perfect.");  
        }
        else{
            System.out.println("the number " + n+ " is not perfect.");
        }
        sc.close();
    }
}
