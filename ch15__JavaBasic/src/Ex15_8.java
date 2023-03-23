
// #15.22 FileReader와 FileWriter
import static java.lang.System.*;
import java.io.*;
import java.nio.charset.Charset;

public class Ex15_8 {
    public static void main(String[] args) {
        try {
            String fileName = "test.txt";
            FileInputStream fis = new FileInputStream(fileName);
            FileReader fr = new FileReader(fileName);

            int data = 0;
            // FileInputStream을 이용해 파일내용을 읽어 화면에 출력
            while ((data = fis.read()) != -1) {
                out.print((char) data);
            }
            out.println();
            fis.close();

            // FileReader를 이용해서 파일내용을 읽어 화면에 출력한다.
            while ((data = fr.read()) != -1)
                out.print((char) data);
            out.println();
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
