// # 13.27 suspend( ), resume( ), stop( ) 예제

import static java.lang.System.*;

public class Ex13_10 {
    public static void main(String[] args) {
        RunImplEx10 r = new RunImplEx10();
        Thread th1 = new Thread(r, "*");
        Thread th2 = new Thread(r, "**");
        Thread th3 = new Thread(r, "***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend(); // th1 일시정지

            Thread.sleep(2000);
            th2.suspend(); // th2 일시정지

            Thread.sleep(3000);
            th1.resume(); // th1 다시 동작

            Thread.sleep(3000); // th1, th2 강제종료
            th1.stop();
            th2.stop();

            Thread.sleep(2000); // th3 강제종료
            th3.stop();

        } catch (InterruptedException e) {

        }

    } // main

}

class RunImplEx10 implements Runnable {
    public void run() {
        while (true) {
            out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
// run
