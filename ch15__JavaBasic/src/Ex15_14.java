
// #15.28 표준 입출력의 대상변경 예제
import static java.lang.System.*;
import java.io.*;

public class Ex15_14 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("test.txt");
            ps = new PrintStream(fos);
            System.setOut(ps); // System.out의 출력대상을 test.txt파일로 변경
        } catch (Exception e) {
            err.println("File not found.");
        }

        out.println("Hello by System.out");
        err.println("Hello by System.err");
    }
}
