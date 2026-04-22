package Java_8_feature.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class terminalOperation {
    public static void main(String[] args) {
//         🔹 Terminal Operations (more complete list)
//        One-line: Trigger execution
//        forEach(), forEachOrdered() -
//        collect() -
//        toArray()
//        reduce()-
//        count()-
//        min(), max()
//        findFirst(), findAny() -
//        anyMatch(), allMatch(), noneMatch()-
//        iterator()
//        spliterator()
//🔥 Extra (Important for Interview)
//        Stream.of(), Arrays.stream() → Stream creation (not intermediate/terminal)
//        parallel() / sequential() → change stream mode

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        //1. collect
        List<Integer> collect = list.stream().filter(x -> x > 2).collect(Collectors.toList());
        System.out.println(collect);

        //2. ForEach
        list.stream().forEach(System.out::println);

        //3. reduce -- Combine element to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y); //list.stream().reduce(Integer::sum)
        System.out.println("Sum of the element =>" + optionalInteger.get());

        //4. cout
        long evenCount = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println(evenCount);

        //5. anyMatch , allMatch, noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x % 2 == 0);
        System.out.println(b2);

        //6. findFirst(), findAny()

        Optional<Integer> first = list.stream().filter(x -> x > 2).findFirst();
        System.out.println(first.get());

        Optional<Integer> any = list.stream().map(x -> x * 2).findAny();
        System.out.println(any);


        // Example  name length >3

        List<String> name = Arrays.asList("Anna", "bob", "Vinay", "Ram", "Shyam");
        List<String> list1 = name.stream().filter(x -> x.length() > 3).toList();
        System.out.println("name length >3 ->  " + list1);

        //Example squaring and sorting number

        List<Integer> num = Arrays.asList(4,2,5,8,3,6);
        List<Integer> list2 = num.stream().map(x -> x * x).sorted().toList();
        System.out.println("squaring and sorting number  ->  " + list2);

        // Example summing values
        Optional<Integer> optionalInteger1 = list.stream().reduce((x, y) -> x + y);
        System.out.println("summing values  -> " + optionalInteger1.get());

        //Example counting Occurrences of character

        String  sentances = "Hello World";
        char[] charArray = sentances.toCharArray();
        //  Arrays.stream(charArray); here it not work because Arrays.stream is not available for CharArray
        IntStream chars = sentances.chars();
        long count = chars.filter(x -> x == 'l').count();
        System.out.println("counting Occurrences of character => " + count);
        // or---
        long count1 = "Hello Worldd".chars().filter(c -> c == 'l').count();
        System.out.println(count1);




    }
}
