
// #15.30 File 예제 1
import static java.lang.System.*;
import java.io.*;

public class Ex15_15 {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\Coding\\java\\jdk11\\work\\ch15");
        File f = new File(dir, "Ex15_15.java");
        f.createNewFile(); // 새로운 파일이 생성된다.
        String fileName = f.getName();
        int pos = fileName.lastIndexOf(".");

        out.println("경로를 제외한 파일이름 - " + f.getName());
        out.println("확장자를 제외한 파일이름 - " + fileName.substring(0, pos));
        out.println("확장자 - " + fileName.substring(pos + 1));

        out.println("경로를 포함한 파일이름 - " + f.getPath());
        out.println("파일의 절대경로 - " + f.getAbsolutePath());
        out.println("파일의 정규경로 - " + f.getCanonicalPath());
        out.println("파일이 속해 있는 디렉토리 -" + f.getParent());
        out.println();
        out.println("File.pathSeparator - " + File.pathSeparator);
        out.println("File.pathSeparatorChar -" + File.pathSeparatorChar);
        out.println("File.separator" + File.separator);
        out.println("File.separatorChar" + File.separatorChar);
        out.println();
        out.println("user.dir=" + System.getProperty("user.dir"));
        out.println("sun.boot.class.path=" + System.getProperty("sun.boot.class.path"));
        out.println("sun.boot.class.path=" + System.getProperty("java.endorsed.dirs"));
        System.getProperties().list(System.out); // System관련 properties 목록보기

    }
}
