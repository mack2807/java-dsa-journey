package Chapter_01.Knows_Basic_Math;

public class CountDigit {
    public int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.print("countof the digit : ");
        return count;
        //TC= O(logn)
        //SC= O(1)
    }
    public static  void cout_digit(int n){
        int digit= (int)(Math.log10(n)+1);
        System.out.println(digit);

//        Time Complexity: O(1)
//        Space Complexity: O(1)

    }

    public static void main(String[] args) {
        int n = 123456789;
//        CountDigit Digit = new CountDigit();
//        System.out.print(Digit.countDigit(n));
        cout_digit(n);
    }
}
