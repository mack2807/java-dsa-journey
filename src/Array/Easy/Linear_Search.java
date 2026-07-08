package Array.Easy;

public class Linear_Search {
    public static  int search(int[] arr, int target){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,8,4,7,0,4};
        int target  = 7;
        int search = search(arr, target);
        System.out.println("target index is : " + search);

    }
}
