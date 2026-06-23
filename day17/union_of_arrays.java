package day17;

import java.util.HashSet;
import java.util.Scanner;

public class union_of_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n1= sc.nextInt();
    int[] a = new int[n1];
    for(int i =0; i<n1; i++){
        a[i] = sc.nextInt();
    }
    int n2= sc.nextInt();
    int[] b = new int[n2];
    for(int i =0; i<n2; i++){
        b[i] = sc.nextInt();
    }
    HashSet<Integer> set = new HashSet<>();
    for(int i =0; i<n1; i++){
        set.add(a[i]);
    }
    for(int i =0; i<n2; i++){
       set.add(b[i]);
       
    }
     for(int num : set) {
            System.out.print(num + " ");
        }
    sc.close();
    }
}
