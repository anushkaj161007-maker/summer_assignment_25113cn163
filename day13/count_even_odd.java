package day13;

import java.util.Scanner;

public class count_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter elements: ");
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int even_count =0;
        int odd_count =0;
        for(int i =0; i<n ; i++){
            if(arr[i]%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }
        System.out.println("even elements: "+ even_count);
        System.out.println("odd elements: "+ odd_count);
        sc.close();
    }
}
