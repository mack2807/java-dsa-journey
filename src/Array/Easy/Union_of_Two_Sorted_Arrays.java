package Array.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Union_of_Two_Sorted_Arrays {
    //Brute Force (Union of to sorted Array)
    //TC: O((n+m)log(n+m))
    //sC:O(n+m) to retrun response
    public  List<Integer> union(int[] arr1, int[] arr2){
        int n = arr1.length;;
        int m = arr2.length;

        // Create a temp Set
        Set<Integer> temp = new TreeSet<>();

        //Copy 1st array in set
        for (int num : arr1){
                temp.add(num);
        }

        //Copy 2nd array in Set
        for (int num : arr2){
            temp.add(num);
        }

        //convert set into new list
        // <Integer> union_array = new ArrayList<>(temp);

        return new ArrayList<>(temp);

    }

    // Optimal Approch
    //TC: O(m+n)
    //SC: O(m+n) (for the output list)

    public List<Integer> unionArrayWithOptimalApproch(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        //Itrate while both array have element
        while ( i< n && j<m){
            //if elemt in arr1 is smaller
            if (arr1[i] < arr2[j]){
                if (union.isEmpty() || union.getLast() != arr1[i]){
                    union.add(arr1[i]);
                }
                // move pointer to next element
                i++;
            }
            // If element in arr2 is smaller
            else if (arr2[j] < arr1[i]){
                    if (union.isEmpty() || union.getLast() != arr2[j]){
                        union.add(arr2[j]);
                    }
                //move pointer to next element
                j++;
            }else {
                //Element are equal, and not once in duplicate
                if(union.isEmpty() || union.getLast() != arr1[i]){
                    union.add(arr1[i]);
                }
                //move both pointer to next element
                i++;
                j++;
            }

        }
        //Append remaining element of arr1 in union array
        while(i < n){
            if (union.isEmpty() || union.getLast() != arr1[i]){
                union.add(arr1[i]);
            }
            // move pointer to next element
            i++;
        }
        //Append remaining element of arr2 in union array
        while (j < m){
            if (union.isEmpty() || union.getLast() != arr2[j]){
                union.add(arr2[j]);
            }
            //move pointer to next element
            j++;
        }
        // Return the union list
        return union;

    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,5,6,8,8};
        int[] arr2 = {3,4,5,5,7,8,9};

        Union_of_Two_Sorted_Arrays unionArray = new Union_of_Two_Sorted_Arrays();
//        List<Integer> union = unionArray.union(arr1, arr2);
        List<Integer> unionOptimized = unionArray.unionArrayWithOptimalApproch(arr1, arr2);

        for (int num : unionOptimized ){
            System.out.print(num +" ");
        }
    }
}
