package Array.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestElement {
    //Optimal Approch
    public int largestElement(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    //Brute Force Approch
    private static int max(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[] args) {
        int[] arr = {4,7,2,8,9,1,3,6, 11};
        LargestElement findMaxElement = new LargestElement();
        int max= findMaxElement.largestElement(arr);
        System.out.println("Largest Ekement is :" + max);
        System.out.println();
        System.out.println(max(arr));


    }
}
