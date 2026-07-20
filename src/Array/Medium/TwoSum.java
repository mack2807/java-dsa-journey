package Array.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    //Brute Force
    //TC:  O(N²)
    //SC: O(1)
    public static String twosum(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return "YES";
                }
            }
        }
        return "No";
    }

    public static int[] twoSumIndices(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    //Better Approach (using hashing)
    //TC: O(n)
    //SC: O(n)
    public static String twoSumBetter(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            int complement = target - arr[i];
            if (map.containsKey(complement)){
                return "Yes";
            }
            map.put(arr[i], i);
        }
        return "No";
    }
    public static int[] twoSumIndicesBetter(int[] arr, int target){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            int complement = target - arr[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement) , i};
            }
            map.put(arr[i] , i);
        }
        return new int[]{-1,-1};
    }

    //Optimal Approach (using two pointer for sorted Array)
    //TC: O(n)
    //SC: O(1)
    public static String twoSumOptimal(int[] arr, int target){
        int n = arr.length;
        int left = 0, right = n-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                return "Yes";
            } else if (sum < target) {
                left++;
            }else {
                right--;
            }
        }
        return "NO";
    }


    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 6, 1, 4};
        int[] nums ={2, 5, 6, 8, 11};
        int target = 15;
//        String twosum = twosum(arr, target);
//        int[] ints = twoSumIndices(arr, target);
//        String twoSumBetter = twoSumBetter(arr, target);
        int[] twoSumIndicesBetter = twoSumIndicesBetter(arr, target);
        String twoSumOptimal = twoSumOptimal(nums, target);
        System.out.println("Two sum is present optimal : " +  twoSumOptimal);
        System.out.print("Two sum is present : " + Arrays.toString(twoSumIndicesBetter));
    }



}
