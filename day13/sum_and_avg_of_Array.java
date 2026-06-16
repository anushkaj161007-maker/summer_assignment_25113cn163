package day13;

import java.util.Scanner;

public class sum_and_avg_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter elements: ");
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =0; i<n ; i++){
            sum += arr[i];
        }
        int avg = sum/n;
        System.out.println("sum of array is: "+ sum);
        System.out.println("Avg of array is: "+ avg);
        sc.close();
    }
}
