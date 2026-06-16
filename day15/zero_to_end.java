package day15;

import java.util.Scanner;

public class zero_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        while(index < n) {
            arr[index] = 0;
            index++;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
