
// #15.31 File 예제2
import static java.lang.System.*;
import java.io.*;

public class Ex15_16 {
    public static void main(String[] args) {
        if (args.length != 1) {
            out.println("USAGE : java Ex15_16 DIRECTORY");
            System.exit(0);
        }

        File f = new File(args[0]);

        if (!f.exists() || !f.isDirectory()) {
            out.println("유효하지 않은 디렉토리입니다.");
            System.exit(0);
        }

        File[] files = f.listFiles();

        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
        }
    }
}
