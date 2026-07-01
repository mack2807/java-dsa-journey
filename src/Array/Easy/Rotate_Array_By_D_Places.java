package Array.Easy;

import java.util.Arrays;

public class Rotate_Array_By_D_Places {
    //Right rotate
    //Optimal approch
    // TC: O(n)
    // SC: O(1)
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }

    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int d = k % n;
        reverse(nums, 0, n - d - 1);
        reverse(nums, n - d, n - 1);
        reverse(nums, 0, n - 1);
    }

    //Brute Force Approach
    // TC: O(n)
    // SC: O(k)

    // 1. Rotate the array to the left by k positions
    public static void rotateLeft(int[] arr, int k){
        int n = arr.length;
        if (n == 0 ) return;
        k = k % n;

        //Store first k element in temp array
        int[] temp = Arrays.copyOfRange(arr, 0 , k);

        //Shift remaining element to left
        for (int i = k; i< n; i++){
            arr[i-k] = arr[i];
        }

        //Copy stored array to end
        // System.arraycopy(temp, 0, arr, n - k, k);
        for (int i = 0; i<k; i++){
            arr[n-k+i] = temp[i];
        }
    }

    // 2. Rotate the array to the right by k positions
    public static void rotateRight(int[] arr, int k){
        int n = arr.length;
        if(n == 0) return;
        k = k % n;
        // Store last k elements
        int[] temp = Arrays.copyOfRange(arr, n-k, n);

        //Shift remaining element to right
        for (int i = n-k-1; i>=0; i--){
            arr[i+k] = arr[i];
        }

        // Copy the stored elements to the front
        for (int i = 0; i < k; i++){
            arr[i] = temp[i];
        }

    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
//        rotate(arr, k);
//        rotateLeft(arr, k);
        rotateRight(arr, k);


        for (int num : arr){
            System.out.print(num + " ");
        }

    }

}
