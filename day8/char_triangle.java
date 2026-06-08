package day8;

import java.util.Scanner;

public class char_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            char a = 'A';
            for(int j =1; j<=i; j++){
                System.out.print(a);
                a++;
            }
            System.out.println(" ");
            
        }
        sc.close();
    }
}
