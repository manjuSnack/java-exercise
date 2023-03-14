
// # 13.12 쓰레드의 I/O Blocking 예제 1
import static java.lang.System.*;
import javax.swing.JOptionPane;

public class Ex13_4 {
    public static void main(String[] args) throws Exception {
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        out.println("입력하신 값은 " + input + "입니다.");

        for (int i = 10; i > 0; i--)
            out.println(i);
        try {
            Thread.sleep(1000); // 단위는 millisecond[ms]로 1초간 시간을 지연한다.
        } catch (Exception e) {
        }
    }
}
