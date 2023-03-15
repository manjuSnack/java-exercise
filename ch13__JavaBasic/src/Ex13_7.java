
// # 13.19 데몬 쓰레드(daemon thread) 예제
import static java.lang.System.*;

class Ex13_7 implements Runnable {

    static boolean autoSave = false;

    // main thread ( 일반 )
    public static void main(String[] args) {
        Thread t = new Thread(new Ex13_7()); // Thread(Runnable r)
        t.setDaemon(true); // 이 부분이 없으면 종료되지 않는다. start()를 호출하기 전에 실행되어야 한다.
        t.start();

        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000); // 1000[ms]인 1초 마다
            } catch (InterruptedException e) {
            }
            out.println(i);

            if (i == 5)
                autoSave = true; // 5초 이후부터 자동저장이 시작되게
        }

        out.println("프로그램을 종료합니다.");
    } // main

    // deamon thread ( 보조 )
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000); // 3초마다
            } catch (Exception e) {
            }
            // autoSave가 true이면 autoSave() 호출
            if (autoSave)
                autoSave();
        }
    } // run

    public void autoSave() {
        out.println("작업파일이 자동저장되었습니다.");
    }
}
