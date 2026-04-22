package Chapter_01.Recursion;


import java.util.Arrays;
import java.util.Collections;

public class Reverse {
    public static void reverse(int[] num) {
        int n = num.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }

    public static void reversdeRec(int[] num, int index) {
        if (index < 0) return;
        System.out.print(num[index] + " ");
        reversdeRec(num, index - 1);
    }

    //Chapter_01.Recursion with two pointer approch
    public static void reverse1(int[] arr, int l, int r) {
        if (l >= r) return;
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        reverse1(arr, l + 1, r - 1);
    }

    //    Chapter_01.Recursion with single pointer approch
    public static void reverse2(int i, int[] arr, int n) {

        if (i >= n / 2) return;
        int temp = arr[n - i - 1];
        arr[n - i - 1] = arr[i];
        arr[i] = temp;

        reverse2(i + 1, arr, n);

    }

    //    By with the help og inbuild function
    public static void reverse3(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        Integer[] nums = {1, 2, 3, 4, 5};
        reversdeRec(num, num.length - 1);
        System.out.println(" ");
        reverse(num);

        reverse1(num, 0, num.length - 1);
        System.out.println(" ");
        System.out.println(" ");
        reverse2(0, num, num.length);
        for (int arr : num) {
            System.out.print(arr + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        reverse3(nums);
        for (int arr : nums) {
            System.out.print(arr + " ");
        }
    }
}
