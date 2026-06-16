package Array.Easy;

import java.util.Arrays;

public class Second_Largest_Smallest {
    //Brute Force Approch
    // TC	O(n log n)
    //Space	O(1) (ignoring sort internals)
    private static int secondLargest (int[] arr, int n){
        Arrays.sort(arr);
        int largest = arr[n-1];
        int secondLargest = 0;
        for (int i = n-2 ; i >= 0; i--){

            if (arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    //Better Approch
    // TC :O(2n)
    // SC : O(1)
    private static  int SL(int[] arr, int n){
        int Largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > Largest){
                Largest= arr[i];
            }
        }
        int secondLarge = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]>secondLarge && arr[i] != Largest){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    //Optimal Approch
    // TC :O(n)
    // SC : O(1)
    private static int secondMax(int[] arr, int n){
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest == Integer.MIN_VALUE  ? -1 : secondLargest;
    }




    public static void main(String[] args) {
//        int[] arr = {3,2,6,1,9,8,4};
        int[] arr = {4,4};
        int n = arr.length;
        int secondMax= secondMax(arr, n );
        System.out.println("Second Largest Element : "+ secondMax);

    }
}
