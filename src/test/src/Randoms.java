package test.src;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Randoms implements Supplier<String> {
    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
        Stream.generate(new Randoms());
    }

    public String get(){
        Integer a = 1;
        a.toString();
        return null;
    }
}
