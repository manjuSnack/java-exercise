
// #15.32 File 예제3, 해당 확장자를 가진 파일 삭제
import static java.lang.System.*;
import java.io.*;

public class Ex15_17 {
    static int deletedFiles = 0;

    public static void main(String[] args) {
        if (args.length != 1) {
            out.println("USAGE : java Ex15_17 Extension");
            exit(0); // System.exit(0);
        }

        String currDir = System.getProperty("user.dir");

        File dir = new File(currDir); // 파일 경로
        String ext = "." + args[0]; // 확장자

        delete(dir, ext);
        out.println(deletedFiles + "개의 파일이 삭제되었습니다.");

    } // main

    public static void delete(File dir, String ext) {
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                delete(files[i], ext);
            } else {
                String filename = files[i].getAbsolutePath();

                if (filename.endsWith(ext)) {
                    out.println(filename);
                    if (files[i].delete()) {
                        out.println(" - 삭제 성공");
                        deletedFiles++;
                    } else
                        out.println(" - 삭제 실패");
                }
            }
        }
    }
}
