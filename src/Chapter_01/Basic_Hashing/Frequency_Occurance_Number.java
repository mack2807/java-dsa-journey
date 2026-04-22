package Chapter_01.Basic_Hashing;

import java.util.Scanner;

public class Frequency_Occurance_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Pre-storing (frequency count)
        int[] hash = new int[13]; // since max element = 12
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // Step 2: Fetching
        int q = sc.nextInt();
        while (q-- != 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
