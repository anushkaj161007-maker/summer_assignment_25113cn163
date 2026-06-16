package day14;

import java.util.Scanner;

public class freq_of_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter elements: ");
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter a element: ");
        int key = sc.nextInt();
        int count =0;
        for(int i =0; i<n ; i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println("frequency of "+ key+ " is "+ count);
        sc.close();
    }
    
}
