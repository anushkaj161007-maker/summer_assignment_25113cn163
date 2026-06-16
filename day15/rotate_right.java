package day15;

import java.util.Scanner;

public class rotate_right {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = n-1; i>0; i--) {
            arr[i] = sc.nextInt();
        }

        int last = arr[n-1];

        for(int i = 0; i < n - 1; i++) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        for(int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
