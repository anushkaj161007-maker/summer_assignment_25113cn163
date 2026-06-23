package day17;
import java.util.*;

public class intersection_arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr1)
            set.add(num);

        for(int num : arr2) {
            if(set.contains(num))
                System.out.print(num + " ");
        }
        
    }
}
