// # 13.25 interrupt( ) 예제

import static java.lang.System.*;
import javax.swing.JOptionPane;

public class Ex13_9 {
    public static void main(String[] args) throws Exception {
        ThreadEx9_1 th1 = new ThreadEx9_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
        out.println("입력하신 값은 " + input + "입니다.");
        out.println("isInterrupted():" + th1.isInterrupted());
        th1.interrupt(); // # th1의 쓰레드를 interrupted상태가 false에서 true가 된다.
        out.println("isInterrupted():" + th1.isInterrupted());

        // th1이 아닌 실상은 main 쓰레드이다.
        // out.println("interrupted() : " + th1.interrupted());
        out.println("interrupted() : " + Thread.interrupted()); // main 쓰레드가 interrupted 되었는지 확인
    }
}

class ThreadEx9_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && !isInterrupted()) {
            out.println(i--);
            for (long x = 0; x < 2500000000L; x++) // 시간지연
                ;
        }
        out.println("isInterrupted():" + this.isInterrupted());
        out.println("interrupted() : " + Thread.interrupted());

        out.println("카운트가 종료되었습니다.");
    }
}
