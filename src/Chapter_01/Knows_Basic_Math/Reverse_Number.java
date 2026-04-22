package Chapter_01.Knows_Basic_Math;

public class Reverse_Number {
    public static void reverse(int n){
        //List<Integer> reverse = new ArrayList<>();//
        int sign;
        sign=(n<0) ?-1:1;
        n= Math.abs(n);

        int reverse=0;
        while (n>0){
            int digit =n%10;
         //   reverse.add(digit);
            reverse= reverse*10+digit;
            n=n/10;
        }
        System.out.println(reverse*sign);
    }

    public static void rev(String s){
        int n= s.length();
        for (int i=n-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }

    }

    public static void main(String[] args) {
        int n= -1234;
        String str = "vinay";
        rev(str);
    }

}
