package day14;
import java.util.Scanner;
public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("enter elements: ");
        for(int i =0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("dupliacte elements ");
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }

            }
        }
        

        sc.close();
    }
}
