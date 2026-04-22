package Chapter_01.Knows_Basic_Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisor {
    public static List<Integer> divisor(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result.add(i);
            }
        }
        return result;
    }

    public static void divisor2(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

        }
    }

    public static List<Integer> divisorOptimal(int n) {
        int sqrt = (int) Math.sqrt(n);
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                result.add(i);
                if (i != n / i) {
                    result.add(n / i);
                }
            }
        }
        Collections.sort(result);
        return result;

//        TC= O(√n)
//        SC= O(1)
    }

    public static void main(String[] args) {
        int n = 36;
        List<Integer> result = new ArrayList<>(divisorOptimal(n));
        for (int divisor : result)
            System.out.print(divisor + " ");
    }
}
