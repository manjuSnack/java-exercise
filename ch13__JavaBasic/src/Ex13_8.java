// # 13.23 sleep() 예제

import static java.lang.System.*;

public class Ex13_8 {
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        th1.start();
        th2.start();

        // try {
        // th1.sleep(2000); // 실제론 main method를 실행하는 main thread가 영향받음.
        // Thread.sleep(2000); // 위의 내용보다 바람직하다. sleep( )은 static이기 때문에 자신이 호출한 자기자신만을
        // 적용한다.
        // } catch (InterruptedException e) {
        // }

        delay(2000); // delay method를 만들어 사용하는 방법
        out.print("<<main thread 종료>>");
    }

    static void delay(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
        }
    }
}

class ThreadEx8_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            out.print("-");
        out.print("<<th1 thread 종료>>");
    }
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++)
            out.print("|");
        out.print("<<th2 thread 종료>>");
    }
}