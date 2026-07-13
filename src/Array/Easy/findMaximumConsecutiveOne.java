package Array.Easy;

public class findMaximumConsecutiveOne {
    public static int maxConsecutive(int[] nums){
        //Variable to store maximum consecutive 1's
        int maxi = 0;
        //Variable to store current count of consecutive 1's
        int count = 0;

        int n = nums.length;

        for (int i =0; i<n; i++){
            if (nums[i] == 1){
                count++;
                //Update maximum if current count is greater
                maxi = Math.max(maxi, count);
            }else {
                count = 0;
            }
        }
        return maxi;

    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int n = nums.length;
        int maxed = maxConsecutive(nums);
        System.out.print("Maximum cout is :" + maxed);
    }
}
