package Array.Easy;

public class Move_Zeroes {
    //Brute Force
    //TC: O(n)
    //SC: O(n)
    public static int[] move_zero(int[] nums){
        int n = nums.length;
        // Create Temp array
        int[] temp = new int[n];
        int index = 0;

        for (int num : nums) {
            // If non-zero, copy to temp
            if (num != 0) {
                temp[index] = num;
                index++;
            }
        }
        // Copy temp back to original
        for (int i = 0; i < n; i++){
            nums[i] = temp[i];
        }

        // Return updated array
        return nums;

    }

    //Optimal Approch
    //TC: O(n)
    //SC: O(1)
    public static void move_zeros_to_end(int[] nums){
        int n = nums.length;
        int j = -1;

        //Find 1st zero element
        for (int i =0; i< n; i++){
            if (nums[i] == 0 ){
                j =i;
                break;
            }
        }
        // If no zero found, return
        if (j == -1) return;

        for (int i = j+1; i<n; i++){
            if (nums[i] != 0 ){
                int temp = nums[j];
                 nums[j] = nums[i];
                 nums[i] = temp;
                j++;

            }
        }
    }

    public static void main(String[] args){
        int[] nums = {2,0,5,4,0,8,0,1,9,0};

//        move_zero(nums);
        move_zeros_to_end(nums);

        for (int num : nums){
            System.out.print(num + " ");
        }
    }


}
