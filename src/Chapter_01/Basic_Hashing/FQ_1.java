package Chapter_01.Basic_Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FQ_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
//        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<n;i++){
            int num = arr[i];
            int freq =0;
            if (map.containsKey(num)){
                freq = map.get(num);
            }
            freq++;
            map.put(num,freq);
        }
        System.out.println("Frequency map : ");
        for (Map.Entry<Integer,Integer> it : map.entrySet()){
            System.out.println(it.getKey()+"->"+it.getValue());
        }

        int minFreq = Integer.MAX_VALUE;
        int maxfreq = Integer.MIN_VALUE;
        int maxkey=-1, minkey=-1;

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int freq = entry.getValue();
            if (freq > maxfreq ){
                maxfreq = freq;
                maxkey = key;
            }
            if (freq<minFreq){
                minFreq = freq;
                minkey = key;
            }
        }

        System.out.println("Max Occ  is "+maxkey +"->"+maxfreq);
        System.out.println("Min Occ is "+minkey+"-> "+minFreq);

    }

}
