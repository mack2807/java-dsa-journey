package Chapter_01.TUF.PATTERN;

import java.util.Scanner;

public class Pattern {
    public   static void pattern1(int n){
        for (int i=0; i<n; i++){
            for (int j=0;j<n; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public  static  void pattern2(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public  static  void pattern3(int n){
        for (int i =1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    public static  void pattern4(int n){
        for (int i=0;i<=n;i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }

    public static void pattern5(int n){
        for (int i=0; i<n;i++){
            for (int j=n; j>i;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void pattern6(int n){
        for (int i=n; i>0; i--){
            for (int j=1; j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println("");
        }
    }

    public static void patternSix2(int n){
        for (int i=0; i<n; i++){
            for (int j=n; j>i; j--){
                System.out.print(n-j+1 +"");
            }
            System.out.println("");
        }
    }

    public  static  void pattern7(int n){
        for (int i=0;i<n;i++){
            //space
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");

        }
    }

    public  static  void pattern8(int n){
        for (int i =n;i>0;i--){
            //sapce
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            //star
            for (int j=0;j<2*i-1;j++){
                System.out.print("* ");
            }
            //space
            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of the pattern : ");

        int n= sc.nextInt();
        pattern8(n);
    }
}
