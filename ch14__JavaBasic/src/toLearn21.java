// #14.21 스트림 만들기 - 람다식 iterate(), generate()

import static java.lang.System.*;

import java.nio.file.Path;
import java.util.*;
import java.util.stream.*;

public class toLearn21 {
    public static void main(String[] args) {
        // # iterate()
        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2).limit(10); // 0, 2, 4, 6, ...
        evenStream.forEach(i -> out.printf("%d,", i));
        out.println();

        // generate()
        Stream<Double> randomStream = Stream.generate(Math::random).limit(10);
        Stream<Integer> oneStream = Stream.generate(() -> 1).limit(5);
        randomStream.forEach(i -> out.printf("%f,", i));
        out.println();
        oneStream.forEach(i -> out.printf("%d,", i));
        out.println();

        // mapToInt()
        // IntStream intStr = stream.iterate(0, n -> n+2); // Error. 기본형 스트림 타입의 참조변수로
        // 다룰 수 없다.
        // DoubleStream dbStr = stream.iterate(Math::random); // Error

        IntStream intStr = Stream.iterate(0, n -> n + 2).mapToInt(Integer::valueOf).limit(5);
        Stream<Integer> stream = intStr.boxed(); // IntStream → Stream<Integer>로 변환
        stream.forEach(i -> out.printf("%d,", i));

    }
}
