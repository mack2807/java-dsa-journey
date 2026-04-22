package Chapter_02.Sorting_01;

public class SelectionSort {
    private static void selectionSort(int[] arr) {
        int n = arr.length;


        //Traverse through all element
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume current index hold minimum

            //find the minimum element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if smaller is found
                }
            }

            //Swap the foud minimum element with first element of unsorted part
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("After Selection sort");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        //Print before selection sort
        System.out.println("Before selection sort");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // call selection sort
        selectionSort(arr);
    }


}
