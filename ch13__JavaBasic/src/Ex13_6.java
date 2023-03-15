
// # 13.15 쓰레드의 우선순위 예제
import static java.lang.System.*;

public class Ex13_6 {
    public static void main(String[] args) {
        ThreadEx6_1 th1 = new ThreadEx6_1();
        ThreadEx6_2 th2 = new ThreadEx6_2();

        th2.setPriority(7); // # th2를 우선순위 7로

        out.println("Priority of th1(-) : " + th1.getPriority()); // # th1은 기본값인 5
        out.println("Priority of th2(|) : " + th2.getPriority());
        th1.start();
        th2.start();
    }
}

class ThreadEx6_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            out.print("-");
            for (int x = 0; x < 10000000; x++) // # 작업을 지연시키기 위한 for문
                ;
        }
    }
}

class ThreadEx6_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            out.print("|");
            for (int x = 0; x < 10000000; x++) // # 작업을 지연시키기 위한 for문
                ;
        }
    }
}
