
// # 13.13 쓰레드의 I/O Blocking 예제 2
import static java.lang.System.*;
import javax.swing.JOptionPane;

public class Ex13_5 {
    public static void main(String[] args) {
        ThreadEx5_1 th1 = new ThreadEx5_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        out.println("입력하신 값은 " + input + "입니다.");
    }
}

class ThreadEx5_1 extends Thread {
    public void run() {
        for (int i = 10; i > 0; i--) {
            out.println(i);
            try {
                sleep(1000); // [ms] 단위로 시간을 지연한다.
            } catch (Exception e) {
            }
        }
    }
}
