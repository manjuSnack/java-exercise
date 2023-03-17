
// # 14.15~16 스트림(stream), 스트림의 특징
import static java.lang.System.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class toLearn15_16 {
    public static void main(String[] args) {
        // # 14.15 스트림
        String[] strArr = { "dd", "aaa", "CC", "cc", "b" };

        Stream<String> stream = Stream.of(strArr); // 문자열 배열을 스트림으로

        // 중간연산(distinct() - 중복제거, limit() - 자르기, sorted() - 정렬) / 최종연산(forEach() - 출력)
        stream.distinct().limit(5).sorted().forEach(out::println);

        // # 14.16 스트림의 특징

        // 원본은 그대로! , 읽기만 한다.
        List<Integer> list = Arrays.asList(3, 1, 5, 4, 2);
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        out.println(list);
        out.println(sortedList);

        // Iterator처럼 1회용
        sortedList.forEach(out::print);
        // int numOfList = sortedList.count(); // Error. 스트림이 닫혔다.

        // 지연된 연산
        IntStream intStream = new Random().ints(1, 46); // 1~45범위의 무한스트림
        intStream.distinct().limit(6).sorted().forEach(i -> out.print(i + ", ")); // 로또복권

        // 병렬 스트림
        Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc", "d");
        int sum = strStream.parallel().mapToInt(s -> s.length()).sum(); // parallel()는 병렬작업
    }
}
