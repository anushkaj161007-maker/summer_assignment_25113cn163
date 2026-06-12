package day12;

import java.util.Scanner;

public class perfect_num {
    public static int perfect(int n){
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
        return 0;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.print(perfect(a));

        sc.close();
    }
}
