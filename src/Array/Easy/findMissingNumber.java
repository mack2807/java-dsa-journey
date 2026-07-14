package Array.Easy;

public class findMissingNumber {
    //Brute Froce Approch (Liner Search)
    //TC: O(n^2)
    //SC: O(1)
    public static int findAbsentNumber(int[] arr){
        int n = arr.length + 1;

        // Iterate from 1 to n and check
        // if the current number is present
        for (int i =1; i < n; i++){
            boolean found = false;
            for (int j = 0; j< n-1; j++){
                if (arr[j] == i){
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return -1;
    }

    //Better Approch (Using Hashing)
    //TC: O(n)
    //SC: O(n)
    public static int findMissingNumberBetterApproch(int[] arr){
        int n = arr.length + 1;
        int[] hash = new int[n+1];

        for (int i =0; i<n-1; i++){
            hash[arr[i]]++;
        }

        for (int i =1; i<n+1; i++){
            if (hash[i] == 0){
                return i;
            }
        }
        return -1;
    }

    //Optimal Approch (Using Sum of n terms Formula)
    //TC: O(n)
    //SC: O(1)
    public static int findMissingNoBySum(int[] arr){
        long n = arr.length+1;
        long count = 0;
        for (int i = 0; i<n-1; i++){
            count += arr[i];
        }
        long sum = (n * (n+1)) /2;
        return  (int)(sum-count);
    }

    //Optimal Approch (Using XOR Operation)
    //TC: O(n)
    //SC: O(1)

    public static int findMissisngNoBYXOR(int[] arr){
        int n = arr.length+1;
        int xor1 =0 , xor2 = 0;

        for (int i = 0; i< n-1; i++ ){
            xor2 = xor2 ^ arr[i];
        }
        for (int i = 1; i <= n; i++){
            xor1 = xor1 ^ i;
        }

        return xor1 ^ xor2;
    }



    public static void main(String[] args) {
        int[] arr = {3,6,8,5,7,2,1};
//        int absentNumber = findAbsentNumber(arr);
//        int absentNumber = findMissingNumberBetterApproch(arr);
//        int absentNumber = findMissingNoBySum(arr);
        int absentNumber = findMissisngNoBYXOR(arr);
        System.out.println("Missing number is : " + absentNumber);
    }
}
