package Chapter_01.Knows_Basic_Math;

public class Prime {
    public static boolean prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count == 2 ? true : false;
    }

    public static void main(String[] args) {
        int n = 47;
        System.out.println(checkPrimeOptimal(n));
    }

    public static boolean checkPrime(int n) {
        if (n <= 0 || n % 2 == 0) return false;
        if (n == 2) return true;
        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static boolean checkPrimeOptimal(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (n <= 0 || n % 2 == 0) return false;
        if (n == 2) return true;

        for (int i = 3; i < sqrt; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
//    TC = O(√n)

//    SC = O(1)
//    👉 Time Complexity = O(√n)
//
//    No extra data structures →
//            👉 Space Complexity = O(1)
}
