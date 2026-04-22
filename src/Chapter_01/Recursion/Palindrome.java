package Chapter_01.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public static Boolean palindromme(Integer[] arr){
        List<Integer> ans = new ArrayList<>(Arrays.asList(arr));
        List<Integer> reversed = new ArrayList<>(ans);
        Collections.reverse(reversed);


        return ans.equals(reversed);
    }

    public static boolean palindrom(String[] str,int i, int n){
        if (i>=n/2) return  true;
        if (!str[i].equals(str[n-i-1])) return false;

        return palindrom(str,i+1,n);
    }

    public static  boolean palindromeStringArrays(String str, int n,int i){
       if (i>=n/2) return  true;
       if (str.charAt(i) != str.charAt(n-i-1)) return false;

       return palindromeStringArrays(str,i+1,n);
    }

    public static boolean pal1(String str, int i , int n){
        if (i>=n/2) return true;
        if(str.charAt(i) != str.charAt(n-i-1)) return false;

        return pal1(str,i+1,n);
    }

    public static  void main(String[] args){
        Integer[] arr = {1,2,3,2,1};
        String[] str= {"a","b","c","b","a"};
        String s1= "MADAm";
//        System.out.println("Madam is pdalindroomne : "+ pal1(s1.toUpperCase(),0,s1.length()));
        String[] s= { "A man, a plan, a canal: Panama"};
        String joined_s = String.join("",s);
        String clean_s = joined_s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("given string Array is "+palindromeStringArrays(clean_s,0,clean_s.length()));
//        System.out.print(palindromme(arr));
    }
}
