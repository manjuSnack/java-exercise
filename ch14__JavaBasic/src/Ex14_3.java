
// # 14.10 Predicate의 결합 예제
import java.util.function.*;
import static java.lang.System.*;

public class Ex14_3 {
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate(); // i >= 100과 같다.

        Predicate<Integer> all = notP.and(q.or(r)); // ( i%2 == 0 || i < 200 ) && i >= 100
        out.println(all.test(150));
        out.println(all.test(100));
        out.println(all.test(50));
        out.println(all.test(103));

        String str1 = "abc";
        String str2 = "abc";

        // str1과 str2가 같은지 비교한 결과를 반환
        Predicate<String> p2 = Predicate.isEqual(str1); // 비교할 대상을 매개변수로 지정
        boolean result = p2.test(str2); // 또 다른 비교대상을 매개변수로 지정.
        out.println(result);
    }
}
