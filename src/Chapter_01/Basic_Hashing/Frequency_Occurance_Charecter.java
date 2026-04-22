package Chapter_01.Basic_Hashing;

import java.util.Scanner;

public class Frequency_Occurance_Charecter {
    public static  void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        String s = sc. next();

//        STEP 1: PRE-STORINNG
        int[] hash = new int[26];
        for (int i =0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
//        FETCHING
        int q = sc.nextInt();
        while(q-->0){
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch-'a']);
        }

    }


}
