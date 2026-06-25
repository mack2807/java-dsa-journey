package Array.Easy;

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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        rotate(arr, k);

        for (int num : arr){
            System.out.print(num + " ");
        }

    }

}
