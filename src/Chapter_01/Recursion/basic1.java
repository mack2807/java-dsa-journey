package Chapter_01.Recursion;

public class basic1 {
     static  int count = 5;
    public static void print(){
//        Base Condition

        if (count <=0) return;
        System.out.println(count);
        count--;
//        call recursion function
        print();

    }
//    Increasing Order
    public static void printN(int n, int t){
        if (n>t) return;
        System.out.println(n);
        printN(n+1,t);
    }
//    Decrreading Order
public static void pnrtN(int n , int t){
        if (n<t) return;
        System.out.println(n);
        pnrtN(n-1,t);
}

    public static void printR(int cnt, int t){
        if (cnt >t) return ;
        System.out.println("Vinay");

        printR(cnt+1,t);
    }

//    Print 1 to N (By backtracking)
    public static void printB(int N , int t){
//        base condition
        if (N<1) return;
        printB(N-1, t);
        System.out.println(N);
    }

//    print N to 1 (By backtracing)
    public static void printD(int N, int t){
//        base condition
        if (N>t) return;
        printD(N+1,t);
        System.out.println(N);
    }


    public  static void main(String[] args){
        int n= 5, t=1;
        int q=1;
        printD(1,n);
//        printB(N,N);
//        String s = "vinay";
//        printR(n, t);
//        pnrtN(n,t);
//        print();
    }

}
