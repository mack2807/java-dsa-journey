package Java_8_feature.stream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {
        // A type of stream that enable parallel processing of elements
        // Allowing multiple threads to process parts of the stream simultaneously
        // This can be significantly improve performance for large data sets
        // Workload is distributed across multiple threads

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(x -> factorial(x)).toList();// list.stream().map(ParallelStream::factorial);
        long endtime = System.currentTimeMillis();
        System.out.println("total time taken with sequential stream :" + (endtime-startTime) + "ms");


        startTime = System.currentTimeMillis();
        List<Long> factorialListWithParallelStream = list.parallelStream().map(ParallelStream::factorial).toList();
        endtime = System.currentTimeMillis();
        System.out.println("total time taken with parallel stream : " + (endtime-startTime) + "ms");


    }

    private static long factorial(int n){
        long result =1;
        for (int i =2; i<n; i++){
            result *=i;
        }
        return  result;
    }
}
