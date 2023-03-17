// #14.17 스트림 만들기 - 컬렉션

import static java.lang.System.*;
import java.util.*;
import java.util.stream.*;

public class toLearn17_20 {
    public static void main(String[] args) {
        // #14.17 스트림 만들기 - 컬렉션
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();

        intStream.forEach(out::println);
        // intStream.forEach(out::println); // Error. 스트림이 이미 닫혔다.

        // #14.18 스트림 만들기 - 배열
        // Stream<String> strStream = Stream.of("a", "b", "c");
        // Stream<String> strStream = Stream.of(new String[] { "a", "b", "c" });
        // Stream<String> strStream = Arrays.stream(new String[] { "a", "b", "c" });
        Stream<String> strStream = Arrays.stream(new String[] { "a", "b", "c" }, 0, 3);

        IntStream intStr = IntStream.of(1, 2, 3);
        IntStream intStrArr = IntStream.of(new int[] { 4, 5, 6, });
        IntStream ArrIntStr = Arrays.stream(new int[] { 7, 8, 9 });

        // #14.19 스트림 만들기 - 임의의 수
        IntStream ranStr = new Random().ints(); // 무한 스트림
        ranStr.limit(5).forEach(out::println); // limit()로 5개 요소만 출력

        DoubleStream dbStr = new Random().doubles(5); // 유한 스트림
        dbStr.forEach(out::println); // limit()를 사용하지 않아도 된다.

        // #14.20 스트림 만들기 - 특정범위의 정수
        IntStream intRange = IntStream.range(1, 5);
        intRange.forEach(i -> out.printf("%d,", i));
        out.println();

        IntStream intRangeClosed = IntStream.rangeClosed(1, 5);
        intRangeClosed.forEach(i -> out.printf("%d,", i));
        out.println();

        LongStream longRange = LongStream.range(1, 5L);
        longRange.forEach(i -> out.printf("%d,", i));
        out.println();

        LongStream longRangeClosed = LongStream.rangeClosed(1, 5L);
        longRangeClosed.forEach(i -> out.printf("%d,", i));
        out.println();

        DoubleStream doubleRange = new Random().doubles(5, 1, 2); // doubles(long streamSize, double begin, double end)
        doubleRange.forEach(i -> out.printf("%f, ", i));
    }
}
