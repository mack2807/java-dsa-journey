package Array.Easy;

public class numberAppearsOnce {

    //Brute Force Approch (using linear search)
    //TC: O(N*N), since nested for loops are used
    //SC: O(1) No extra space used
    public static int getSingleElement(int[] arr) {
        int n = arr.length;

        // Count how many times num occurs
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            // If only once, return it
            if (count == 1) {
                return num;
            }
        }
        return -1;
    }

    //Better Approch (using hashing technique)
    //TC: O(N)+O(N)+O(N), where N = size of the array. One O(N) is for finding the maximum, the second one is to hash the elements and the third one is to search the single element in the array.
    //SC:O(maxElement+1) where maxElement = the maximum element of the array.

    public static int getUniqueElement(int[] arr){
        int n = arr.length;

        // Step 1: Find maximum element
        int max = arr[0];
        for (int num : arr){
            max = Math.max(max, num);
        }
        // Step 2: Create frequency array of size maxi+1
        int[] hashArray = new int[max+1];

        // Step 3: Count frequencies
        for (int i = 0; i< n; i++){
            hashArray[arr[i]]++;
        }
        // Step 4: Find element with frequency = 1
        for (int i = 0; i < n; i++){
            if (hashArray[arr[i]] == 1){
                return arr[i];
            }
        }
        return -1;
    }

    //Optimal Approch (using XOR technique)
    //TC: O(N)
    //SC: O(1)

    public static int getUniqueOptimized(int[] arr){
        int xor = 0;
        for (int num : arr){
            xor ^= num;
        }
        return xor;
    }



    public static void main(String[] args) {
        int[] arr = {2,5,7,3,5,7,2,8,3};
//        int singleElement = getSingleElement(arr);
//        int singleElement = getUniqueElement(arr);
        int singleElement = getUniqueOptimized(arr);
        System.out.println("Siingle Elememnt is : " + singleElement);

    }

}
