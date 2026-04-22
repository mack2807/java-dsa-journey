package Chapter_01.Recursion;

public class Recursion {
    static int sum;

    public static int naturalSum(int n, int t) {

        if (n > t) return n;
        sum += n;

        naturalSum(n + 1, t);

        return sum;
    }

    public static void result(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        result(n - 1, sum + n);


    }

    public static void main(String[] args) {
        int n = 10;
        int t = 0;
//        int result= naturalSum(n,t);
        result(n, t);
    }


}
