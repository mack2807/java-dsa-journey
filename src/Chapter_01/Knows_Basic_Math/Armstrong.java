package Chapter_01.Knows_Basic_Math;

public class Armstrong {
    public  static boolean armastrong(int Num){
        int num =  Num;
        int sum=0;
        int n= String.valueOf(Num).length();
        while(num>0){
            int digit = num%10;
            sum = sum +(int) Math.pow(digit, n);
            num = num/10;


        }
        if(Num== sum){
            return true;
        }
        return false;
    }
    public static void main (String[] args){
        int[] num = {153, 123, 1245, 345};
        for(int result :num ){
            System.out.println(result + " is armastrong ?   "+ armastrong(result));
        }

    }

}
