package Chapter_01.Recursion;

public class Sum {

//    parameterised Approch
    public static void checkSum(int n, int sum) {

        if (n < 1) {
            System.out.println(sum);
            return;
        }
        checkSum(n - 1, sum + n);
    }
//    Functinal Approch
    public static int sumC(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumC(n - 1);
    }

    public static void main(String[] args) {
//        int n=5;
//        int result = checkSum(n);
        checkSum(15, 0);
        System.out.println(sumC(5));
    }
}
