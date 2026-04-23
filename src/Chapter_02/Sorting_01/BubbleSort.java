package Chapter_02.Sorting_01;

public class BubbleSort {
    private void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {   //Use two nested loops to iterate over the array
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void optimizeBubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
            System.out.println("run");
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
//        int[] array = {13, 46, 24, 52, 20, 9};
        int[] array = {1, 2, 3, 4, 5};

        //print before bubble sort
        System.out.println("Before bubble sort");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("After bubble sort");

        BubbleSort sorter = new BubbleSort();

//        sorter.bubbleSort(array);

        System.out.println();
        System.out.println("After bubble sort with optimization : ");
        optimizeBubbleSort(array);

    }


}
