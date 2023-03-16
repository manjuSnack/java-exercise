
// # 14.6 함수형 인터페이스 타입의 매개변수, 반환 타입
import static java.lang.System.*;

@FunctionalInterface
interface MyFunction {
    void run(); // public abstract void run();
}

public class Ex14_1 {
    static void execute(MyFunction f) { // 매개변수 타입이 MyFunction 메서드
        f.run();
    }

    static MyFunction getMyFunction() {
        MyFunction f = () -> out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> out.println("f1.run()");

        MyFunction f2 = new MyFunction() { // 익명클래스로 run()을 구현
            public void run() { // public을 반드시 붙일 것
                out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> out.println("run()"));
    }
}