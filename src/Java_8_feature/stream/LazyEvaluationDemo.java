package Java_8_feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Vinay", "David");

        Stream<String> stream = names.stream().filter(x -> {
            System.out.println("Filtering : " + x);   // print 2nd
            return x.length() > 3;
        });

        System.out.println("Before terminal operation"); //print 1st

        List<String> result = stream.toList();

        System.out.println("After terminal operation"); // print 3rd
        System.out.println(result); // print 4th


    }
}
