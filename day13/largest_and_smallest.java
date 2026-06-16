package day13;
import java.util.Scanner;
public class largest_and_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter elements: ");
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for(int i =0; i<n ; i++){
            if(min> arr[i]){
                min = arr[i];
            }
        }
        for(int i =0; i<n ; i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        System.out.println("smallest element: "+ min);
        System.out.println("largest element: "+ max);

        sc.close();
    }

}
