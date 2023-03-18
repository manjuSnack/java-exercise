
// #14.49 Optional<T> 예제
import static java.lang.System.*;
import java.util.*;

public class Ex14_8 {
    public static void main(String[] args) {
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
        out.println("optStr=" + optStr.get());
        out.println("optStr=" + optInt.get());

        int result1 = Optional.of("123")
                // .peek(s -> out.printf("result1 : %s%n", s)) // Optional에는 peek가 없다.
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt)
                .get();

        int result2 = Optional.of("")
                .filter(x -> x.length() > 0)
                .map(Integer::parseInt)
                .orElse(-1);

        out.println("result1=" + result1);
        out.println("result2=" + result2);

        Optional.of("456")
                .map(Integer::parseInt)
                .ifPresent(x -> out.printf("result3=%d%n", x));

        OptionalInt optInt1 = OptionalInt.of(0); // 0을 저장
        OptionalInt optInt2 = OptionalInt.empty(); // 빈 객체 저장

        out.println(optInt1.isPresent()); // true
        out.println(optInt2.isPresent()); // false

        out.println(optInt1.getAsInt()); // 0
        // out.println(optInt2.getAsInt()); // NoSuchElementException
        // out.printf("optInt1=%s%n", optInt1); // IllegalFormatConversionException
        // out.printf("optInt2=%s%n", optInt2);
        // out.printf("optInt1.equals(optInt2)? %d%n", optInt1.equals(optInt2));
        out.println("optInt1=" + optInt1);
        out.println("optInt2=" + optInt2);
        out.println("optInt1.equals(optInt2)? =" + optInt1.equals(optInt2));
    }
}
