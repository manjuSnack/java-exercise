
// #15.25 InputStreamReader, OutputStreamWriter 예제
import static java.lang.System.*;
import java.io.*;

public class Ex15_12 {
    public static void main(String[] args) {
        String line = "";

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            out.println("사용중인 OS의 인코딩 :" + isr.getEncoding());

            do {
                out.print("문장을 입력하세요. 마치시려면 q를 입력하세요.>");
                line = br.readLine();
                out.println("입력하신 문장 : " + line);
            } while (!line.equalsIgnoreCase("q"));

            br.close(); // System.in과 같은 표준입출력은 닫지 않아도 된다.
            out.println("프로그램을 종료합니다.");
        } catch (IOException e) {

        }
    } // main
}
