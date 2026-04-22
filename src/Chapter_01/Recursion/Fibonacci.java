package Chapter_01.Recursion;

public class Fibonacci {
    public static void fibonacci(int n) {

        if (n == 0) {
            System.out.print(0 + " ");
        } else {
            int[] arr = new int[n+1];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i <= n; i++) {
                arr[i] = (arr[i-1]) + (arr[i-2]);
            }
            System.out.println("The Fibonacci Series up to "+n+"th term:");

            for (int i=0;i<=n;i++){
                System.out.print(arr[i]+", ");
            }
        }
    }
public static void fb2(int n, int a, int b){
       if (n<0) return;
       System.out.print(a+" ");

       fb2(n-1,b,a+b);

}
public static int fb3(int n){
        if (n<=1) return n;
        return fb3(n-1)+fb3(n-2);
}

    public static void main(String[] args) {
//        fibonacci(5);
//        fb2(5,0,1);

//        System.out.print(fb3());

    }
}
