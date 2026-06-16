package day14;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter elements: ");
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target: ");
        int target = sc.nextInt();
        boolean a = false;
        for(int i =0; i<n ; i++){
            if(arr[i] == target){
                a = true;
                break;
            }
        }
        if(a== true){
            System.out.println("target element found");
        }
        else{
            System.out.println("element doesn't exist");
        }
        sc.close();
    }
}
