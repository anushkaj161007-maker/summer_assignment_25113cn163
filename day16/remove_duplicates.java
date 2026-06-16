package day16;

import java.util.Scanner;

public class remove_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter elements: ");
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array after removing duplicates: ");
        for(int i =0; i<n; i++){
            boolean duplicate = false;

            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if(!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
        

        sc.close();
    }
}
