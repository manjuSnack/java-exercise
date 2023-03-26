
// #15.33 File 예제4, 파일의 이름을 바꾸기
import java.io.*;
import static java.lang.System.*;

public class Ex15_18 {
    public static void main(String[] args) {
        if (args.length != 1) {
            out.println("USAGE : java Ex15_18 DIRECTORY");
            exit(0); // System.exit(0);
        }

        File dir = new File(args[0]);

        if (!dir.exists() || !dir.isDirectory()) { // .exists : 파일이 존재유무 , .isDirectory : 폴더의 존재유무
            out.println("유효하지 않는 디렉토리입니다.");
            exit(0);
        }

        File[] list = dir.listFiles();

        for (int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();

            // 파일명
            String newFileName = "Ex15" + fileName; // 숫자인 파일이름 앞에 0000을 붙여 순서를 정렬하기 위함
            newFileName = newFileName.substring(newFileName.length() - 7);
            list[i].renameTo(new File(dir, newFileName)); // .renameTo : 기존 파일명을 새로운 파일명으로 바꾸기
        }

    }
}
