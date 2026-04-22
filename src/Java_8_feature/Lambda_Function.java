package Java_8_feature;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Lambda_Function {
    MathOperation sumOperation = Integer::sum;
    MathOperation subtractionOperation = (a, b) -> a - b;
    MathOperation multiplicationoperation = (a, b) -> a * b;
    MathOperation divideOperation = (a, b) -> a/b;


    public static void main(String[] args) {
        Lambda_Function sumOperation = new Lambda_Function();
        int res = sumOperation.sumOperation.operate(3, 4);
        System.out.println(res);
        int res1 = sumOperation.subtractionOperation.operate(3, 4);
        System.out.println(res1);
        int res2 = sumOperation.multiplicationoperation.operate(3, 4);
        System.out.println(res2);
        int res3 = sumOperation.divideOperation.operate(12, 4);
        System.out.println(res3);


        // Predicate function Boolean value function

        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println("Value is even : " + isEven.test(5));
        Predicate<String> isStartWithA = s-> s.toLowerCase().startsWith("a");
        Predicate<String> isEndWith = s-> s.toLowerCase().endsWith("b");
        System.out.println(isStartWithA.and(isEndWith).test("AmaB"));

        //Function Interface
        Function<Integer, Integer> doubleIt = x-> 2 * x;
        Function<Integer, Integer> trippleIt = x-> 3 * x;
        System.out.println(doubleIt.apply(100));
        System.out.println(doubleIt.andThen(trippleIt).apply(20));
        System.out.println(doubleIt.compose(trippleIt).apply(20));

        Function<Integer, Integer> identity = Function.identity();
        Integer resIdentity= identity.apply(5);
        System.out.println(resIdentity);


        // Consumer Functional Interface

        Consumer<Integer> print = x-> System.out.println(x); // System.out::println
        print.accept(500);

        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x->{
            for (int i : x){
                System.out.print(i);
            }
        };
        printList.accept(list);
        System.out.println();


        //Suppiler

        Supplier<String> helloWorld = ()-> "Vinay Maurya";
        System.out.println(helloWorld.get());


        //combined example

        Predicate<Integer> predicate = x -> x%2 ==0;
        Function<Integer, Integer> function = x-> x*x;
        Consumer<Integer> consume = x-> System.out.println(x);  // System.out::println
        Supplier<Integer> supply = () -> 100;

        if (predicate.test(supply.get())){
            consume.accept(function.apply(supply.get()));
        }

        // Bipredicate, BiFunction, Biconsumer
        BiPredicate<Integer, Integer> biPredicate = (x,y)->(x+y) %2 ==0;
        System.out.println(biPredicate.test(5,7));
        BiFunction<String, String, Integer> biFunction = (x,y) -> (x + y).length();
        System.out.println(biFunction.apply("vin","ay"));
        BiConsumer<Integer, Integer> biConsumer = (x,y)->{
            System.out.println(9);
            System.out.println(4);
        };


        //UnaryOperator , BinaryOperator

        UnaryOperator<Integer> unaryOperator = x -> 2*x;
        BinaryOperator<Integer> binaryOperator = (x,y) -> x+y; // Integer::sum;


        //Method Reference     --->  use without invoking & in place of lambda expression

        List<String> students = Arrays.asList("Ram", "Shyam","Mohan");
        students.forEach(x-> System.out.println(x));
        students.forEach(System.out::println);


        //Constructor Reference

        List<String> name = Arrays.asList("A","B","c");
        List<MobilePhone> collect = name.stream().map(x-> new MobilePhone(x)).collect(Collectors.toList());
        List<MobilePhone> collect1 = name.stream().map(MobilePhone::new).toList();

        System.out.println(collect);
        System.out.println(collect1);






    }
}


class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}