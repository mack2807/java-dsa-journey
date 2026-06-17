package Array.Easy;

import java.util.ArrayList;

public class Remove_Element {
    //Brute Force
    // we create a temp array and if element  is not equal to value store in temp array
    //then copy temp array to main arr

    //Optimal Approch
    //TC : O(n)
    //SC : O(1)
    private static  int remove_element(int[] nums, int value){
        int n = nums.length;
        int k = 0;
        for (int i=0;i<n;i++){
            if (nums[i] != value){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,8,0,6,3,2,4};
        int value = 2;
        int i = remove_element(arr, value);
       for (int j = 0; j<i; j++){
           System.out.print(arr[j]+" ");
       }
    }
}
