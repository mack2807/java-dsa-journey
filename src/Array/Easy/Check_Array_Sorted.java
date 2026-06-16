package Array.Easy;

public class Check_Array_Sorted {
    private static boolean isSorted(int[] arr, int n){
        for (int i = 1; i < n; i++){
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
        int n = arr.length;
        boolean isSorted = isSorted(arr, n );
        System.out.println("Is arrya sorted : "+ isSorted);
    }
}
