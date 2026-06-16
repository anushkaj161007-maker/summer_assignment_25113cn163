package day16;

import java.util.Scanner;

public class pair_with_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target sum: ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++) {
            for(int j =i+1; j<n; j++){
                if(arr[i]+ arr[j] == target){
                    System.out.println("the elements are: "+arr[i] + " and " + arr[j]);
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}
