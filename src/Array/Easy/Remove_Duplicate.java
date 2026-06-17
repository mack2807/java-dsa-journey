package Array.Easy;

import java.util.HashSet;

public class Remove_Duplicate {
    //Brute Force 1
    //TC : O(n)
    //SC : O(n)
    private static int remove_duplicate(int[] arr){
        int index = 0;
        HashSet<Integer> setData = new HashSet<>();
        for (int num : arr){
            setData.add(num);
        }
        for (int set : setData){
            arr[index] = set;
            index++;
        }
        return index;
    }
    //Brute Force 2
    //TC : O(n)
    //SC : O(n)
    private static int removeD(int[] arr) {
        int index = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.add(num)) {
                arr[index] = num;
                index++;
            }
        }
        return index;
    }

    //Optimal Approch
    //TC : O(n)
    //SC : O(1)
    private static int RD(int[] arr, int n){
        int i = 0;
        for (int j= 1; j< n;j++){
            if (arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        //i is index number but  arr size is 1 grater so i+1
        return i+1;
    }




    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 5};
        int n = arr.length;

//        int size = remove_duplicate(arr);
//        int size = removeD(arr);
        int rd = RD(arr, n);


        for (int num = 0; num<rd; num++){
            System.out.print(arr[num] + " ");
        }
    }

}
