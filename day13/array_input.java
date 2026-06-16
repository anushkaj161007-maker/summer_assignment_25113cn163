package day13;
import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter elements: ");
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("array elements");
        for(int i =0; i<n ; i++){
            System.out.println(arr[i] + " ");
        }
        sc.close();

    }

}
