package Chapter_02.Sorting_02;

import java.util.ArrayList;
import java.util.List;

public class Merge_Sort {
    //Function for merge to half
    public void merge(int[] arr, int low, int mid, int high){
        //Create temp array
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        //merge both sorted part
        while (left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }else {
                temp.add(arr[right++]);
            }
        }

        // Add remaining left arr
        while (left <= mid){
            temp.add(arr[left++]);
        }

        //Add remaining right arr
        while (right <= high){
            temp.add(arr[right++]);
        }

        //Copy back to original arr
        for (int i = low; i <= high; i++){
            arr[i] = temp.get(i-low);
        }
    }

    // Recursive merge sort
    public void mergeSort(int[] arr, int low, int high){
        //Base condition
        if (low >= high) return;

        //Find mid index
        int mid = (low+high)/2;

        //Sort left half
        mergeSort(arr, low, mid);

        //Sort right half
        mergeSort(arr, mid+1, high);

        //Merge both half
        merge(arr, low, mid, high);

    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,2,9,1,6};
        Merge_Sort ms = new Merge_Sort();
        ms.mergeSort(arr, 0, arr.length-1);
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
}
