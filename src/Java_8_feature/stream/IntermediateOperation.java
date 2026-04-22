package Java_8_feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args){
        // intermediate Operation transform a steam into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked

        //1. filter
        List<String> list = Arrays.asList("Vinay","Aman","Arav","Aman");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        List<String> count = filteredStream.collect(Collectors.toList());
        System.out.println(count);

        //2. Map
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase()); // list.stream().map(String::toUpperCase)

        //3. sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sortedListUsingCustomComparator = list.stream().sorted((a, b) -> a.length() - b.length());

        //4. distinct
        List<String> uniqueList = list.stream().filter(x -> x.startsWith("A")).distinct().toList();
        System.out.println(uniqueList);

        //5. limit
        List<String> uniqueLimit = list.stream().filter(x -> x.startsWith("A")).limit(1).toList();
        System.out.println(uniqueLimit);

        //6. skip
        List<Integer> counting = Stream.iterate(1, x -> x + 1).skip(10).limit(100).toList();
        System.out.println(counting);


        // many more --------
        // mapToInt(), mapToLong(), mapToDouble()
        // flatMap(), flatMapToInt(), flatMapToLong(), flatMapToDouble()
        // peek()
        // takeWhile() ✅ (Java 9+)
        // dropWhile() ✅ (Java 9+)


    }
}
