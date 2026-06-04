package day4;
import java.util.Scanner;
public class armstrong_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int series_upto = sc.nextInt();
        
        
        for(int i =1; i<=series_upto; i++){
            int r =0;
            int temp =i;
            int sum =0;
            while(temp>0){
                r=temp%10;
                sum += r*r*r;
                temp = temp/10;
            }
            if(i == sum){
                System.out.println(i + " is armstrong");
            }
            else{
                System.out.println(i +" is not armstrong");
            }
        }
        sc.close();

     }
}
