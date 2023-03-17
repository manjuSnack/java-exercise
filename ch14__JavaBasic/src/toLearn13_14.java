// # 14.13~14.14 메서드 참조, 생성자의 메서드 참조

import java.util.function.*;
import static java.lang.System.*;

public class toLearn13_14 {

    public static void main(String[] args) {
        // #14.13 메서드 참조

        // 람다식 → 메서드 참조
        // Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        // Function<String, Integer> f = 클래스이름::메서드이름;
        Function<String, Integer> f = Integer::parseInt;

        // 메서드참조 → 람다식
        // Function<String, Integer> f = (String s) Integer::parseInt;
        // Function<String, Integer> f = (String s) -> Integer::parseInt;
        // Function<String, Integer> f = (String s) -> Integer.parseInt;
        // Function<String, Integer> f = (String s) -> Integer.parseInt(s);
        out.println(f.apply("200") + 200);

        // 14.14 생성자의 메서드참조

        // 람다식 -> 메서드 참조
        // Supplier<MyClass> s = () -> new MyClass();
        // Supplier<MyClass> s = 클래스이름::메서드이름;
        // Supplier<MyClass> s = MyClass::new;

        // MyClass mc = s.get();
        // out.println(mc);
        // out.println(s.get()); // 위에 두 문장을 하나로, 또 다른 객체 생성

        // 생성자 람다식 -> 메서드 참조
        // Function<Integer, MyClass> cf = (i) -> new MyClass(i);
        // Function<Integer, MyClass> cf = 클래스이름::메서드이름;
        Function<Integer, MyClass> cf = MyClass::new;

        MyClass mc = cf.apply(100);
        out.println(mc); // MyClass@4ac68d3e
        out.println(mc.iv);

        out.println(cf.apply(200).iv);

        // 배열
        // Function<Integer, int[]> fArr = (i) -> new int[i];
        // Function<Integer, int[]> fArr = 클래스이름::메서드이름;
        Function<Integer, int[]> fArr = int[]::new;

        out.println(fArr.apply(100).length);
    }
}

class MyClass {

    int iv;

    MyClass(int iv) {
        this.iv = iv;
    }
}
