
// # @SafeVarargs / #자바의정석 3판 참고
import static java.lang.System.*;
import java.util.*;

class MyArrayList<T> {
    T[] arr;

    @SafeVarargs // 지네릭스 타입에 가변인자를 사용
    @SuppressWarnings("varargs")
    MyArrayList(T... arr) {
        this.arr = arr;
    }

    @SafeVarargs
    // @SuppressWarnings("unchecked") // 지네릭스로 타입을 지정하지 않았을 때 발생하는 경고를 묵인
    public static <T> MyArrayList<T> asList(T... a) {
        return new MyArrayList<>(a);
    }

    public String toString() {
        return Arrays.toString(arr);
    }

}

public class AnnotationEx4 {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyArrayList<String> list = MyArrayList.asList("1", "2", "3");

        out.println(list);
    }
}
