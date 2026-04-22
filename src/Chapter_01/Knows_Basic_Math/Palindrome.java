package Chapter_01.Knows_Basic_Math;

public class Palindrome {
    public static boolean palindrome(int n){
        int original = n;
        int rev= 0;
        while(n>0){
            int digit = n%10;
            rev= rev*10+digit;
            n=n/10;

        }
        if (rev!=original){
            return false;
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0;
        int original= x;
        while(original != 0){
            int digit = original % 10;
            rev = rev * 10 + digit;
            original = original /10;
        }

        return (rev==x);
    }
    public static  void main(String[] args){
        int n=121;
        Palindrome pal = new Palindrome();
        pal.isPalindrome(n);

    }
}
