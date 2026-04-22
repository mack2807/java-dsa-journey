package Java_8_feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_demo {

    //Stream feature is introduce in java 8
    // process collection of data in functional and declarative  manner
    // Simplify data processing
    // Embrace functional programming
    // Improve readability and maintainability
    // Enable easy parallelism
    //


    // what is stream -->>  a sequence of element supporting functional and declarative programming
    // how to use -->   By source and intermediate and terminal operation

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // for finding number of even count via traditional way
        int count = 0;
        for (int i : numbers){
            if (i %2 ==0){
                count++;
            }
        }

        System.out.println(count);


        // with the help of stream api
        Long evenCount =  numbers.stream().filter(x-> x % 2 == 0).count();
        System.out.println(numbers.stream().filter(x-> x % 2 == 0).count());


        // Types of creating stream

        //1. From collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();

        //2. From Array
        String[] arrays = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(arrays);

        //3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a","b");

        //4. infinite stream
        Stream<Integer> generate = Stream.generate(() -> 1);
        Stream<Integer> iterate = Stream.iterate(1, x -> x + 1);

    }
}
