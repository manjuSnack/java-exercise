
// #14.44 스트림의 최종연산 - reduce( ) 예제
import static java.lang.System.*;
import java.util.*;
import java.util.stream.*;

public class Ex14_9 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(out::println);

        // 배열의 길이가 0이 아닌 경우
        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);

        // s로 시작하는 첫번째(0) index의 값을 찾기
        Optional<String> sWord = Stream.of(strArr)
                .filter(s -> s.charAt(0) == 's')
                .findFirst();

        out.println("noEmptyStr=" + noEmptyStr);
        out.println("sWord=" + sWord.get());

        // Stream(String) → IntStream 변환 / (String::length) == (s) -> s.length()과 같다.
        // 아래 reduce는 스트림 요소를 소모하여 결과를 반환
        // Stream<Integer> intStream = Stream.of(strArr).map(String::length); // map
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length); // mapToInt.

        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1); // 배열 strArr의 index 갯수
        int sum = intStream2.reduce(0, (a, b) -> a + b); // 배열 strArr의 index별 값(이 경우, 단어의 길이)을 더함

        // OptionalInt max = intStream3.reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);
        out.println("count=" + count);
        out.println("sum=" + sum);
        out.println("min=" + min.getAsInt());

        OptionalInt max = IntStream.empty().reduce(Integer::max); // 만약, 빈 값을 준다면 아래 max.getAsInt()는 예외발생
        // out.println("count=" + max.getAsInt());
        out.println("max=" + max.orElse(0)); // 없을 땐 0으로 대체
        out.println("max=" + max.orElseGet(() -> 0)); // 없을 땐 해당 람다식으로 대체
    }
}
