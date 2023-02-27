import static java.lang.System.*;
import java.util.*;

public class Ex11_7 {
    public static void main(String[] args) {
        String[] strArr = { "cat", "Dog", "lion", "tiger" };

        Arrays.sort(strArr);
        out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 안 하는 정렬
        out.println("strArr=" + Arrays.toString(strArr));

        Arrays.sort(strArr, new Descending()); // 내림차순 정렬
        out.println("strArr=" + Arrays.toString(strArr));
    }
}

class Descending implements Comparator {
    public int compare(Object o1, Object o2) {
        // instanceof : 형변환이 가능한지 체크
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable) o1;
            Comparable c2 = (Comparable) o2;
            // return c1.compareTo(o2) * -1; // -1을 곱하여 기본 정렬방식의 역으로 변경
            return c2.compareTo(c1); // 위와 같다.
        }
        return -1;
    }
}