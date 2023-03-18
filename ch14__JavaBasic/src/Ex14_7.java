
// #14.34 스트림의 중간연산 - flatMap() 예제
import static java.lang.System.*;
import java.util.*;
import java.util.stream.*;

public class Ex14_7 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[] { "abc", "def", "jkl" },
                new String[] { "ABC", "GHI", "JKL" });

        // Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream); 아래와 같다.
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(out::println);
        out.println();

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not Three is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) // " +"는 하나 이상의 공백을 구분자로 자른다는 의미
                .peek(s -> out.printf("split : %s%n", s))
                .map(String::toLowerCase) // 소문자로
                .distinct() // 중복제거
                .sorted() // 기본정렬
                .forEach(out::println);
        out.println();
    }
}
