// # 13.9 싱글쓰레드와 멀티쓰레드 예제 1

import static java.lang.System.*;

public class Ex13_2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++)
            out.printf("%s", new String("-"));

        out.print("소요시간1:" + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 300; i++)
            out.printf("%s", new String("|"));

        out.print("소요시간2:" + (System.currentTimeMillis() - startTime));
    }
}
