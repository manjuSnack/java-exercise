// #15.11 FileInputStream과 FileOutputStream 예제1
// #Ex15-4

import static java.lang.System.*;
import java.io.*;

public class FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        // 이클립스에서는 윗 줄 대신 아래 줄 입력하고 Run(ctrl+F11)으로 실행
        // FileInputStream fis = new FileInputStream(".\\src\\FileViewer.java");

        int data = 0;

        while ((data = fis.read()) != -1) {
            char c = (char) data;
            out.print(c);
        }

    }
}
