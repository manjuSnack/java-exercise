// # 14.8 java.util.function패키지 예제

import java.util.function.*;
import java.util.*;
import static java.lang.System.*;

public class Ex14_2 {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1; // 매개변수 X, 반환값 O
        Consumer<Integer> c = i -> out.print(i + ", "); // 매개변수 O, 반환값 X
        Predicate<Integer> p = i -> i % 2 == 0; // 매개변수 하나, 조건식 boolean
        Function<Integer, Integer> f = i -> i / 10 * 10; // i의 1의 자리를 지우기 / 매개변수 하나에 결과 반환

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list); // supplier, list
        out.println(list);

        printEvenNum(p, c, list); // predicate, consumer, list
        List<Integer> newList = doSomething(f, list); // function
        out.println(newList);
    }

    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for (T i : list) {
            newList.add(f.apply(i)); // f apply (T i) : 매개변수 하나에 결과 반환
        }

        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        out.print("[");
        for (T i : list) {
            if (p.test(i)) // Predicate
                c.accept(i); // Consumer
        }
        out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++)
            list.add(s.get()); // Supplier
    }
}
