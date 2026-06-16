package day14;

import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter elements: ");
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int max2 =arr[0];
        for(int i =0; i<n ; i++){
            if(max< arr[i]){
                max2 = max;
                max = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
    }
        }
        
        System.out.println("second largest element: "+ max2);

        sc.close();
    }
}
