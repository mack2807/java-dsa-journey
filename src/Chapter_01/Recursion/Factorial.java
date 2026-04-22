package Chapter_01.Recursion;

public class Factorial {

//    Functinal Approch
    public static int calFact(int n){
        if (n==0) return 1;
        return n*calFact(n-1);
    }

//    paramterised Approch
    public static void claFactrl(int n , int fact){
        if (n<1){
            System.out.println(fact);
            return;
        }
        fact = n*fact;
        claFactrl(n-1,fact);
    }



    public static  void main(String[] args){
       System.out.println(calFact(3));
       claFactrl(10,1);
    }
}
