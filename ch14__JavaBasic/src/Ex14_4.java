
// #14.12 컬렉션 프레임웍과 함수형 인터페이스 예제
import static java.lang.System.*;
import java.util.*;

public class Ex14_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 10; i++)
            list.add(i);

        // list의 모든 요소 출력
        list.forEach(i -> System.out.print(i + ","));
        out.println();

        // list에서 2 또는 3의 배수를 제거한다.
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        out.println(list);

        Map<String, String> map = new HashMap();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        // map의 모든 요소를 {k, v}의 형식으로 출력
        map.forEach((k, v) -> out.printf("{ %s, %s },", k, v));
    }
}
