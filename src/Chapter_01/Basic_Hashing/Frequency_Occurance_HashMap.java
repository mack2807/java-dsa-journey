package Chapter_01.Basic_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_Occurance_HashMap {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //Pre-compute
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            int key = arr[i];
            int freq =0;
            if (map.containsKey(key)){
                freq = map.get(key);
            }
            freq++;
            map.put(key,freq);
        }



        // Step 3: Process queries
        int q =sc.nextInt();
        while(q-->0){
            int num = sc.nextInt();
            if (map.containsKey(num)){
                System.out.println(map.get(num));
            }else {
                System.out.println(0);
            }
        }

        System.out.println("Frequency map : ");
        for (Map.Entry<Integer, Integer> it : map.entrySet()){
            System.out.println(it.getKey()+"->"+it.getValue());
        }
    }

}
