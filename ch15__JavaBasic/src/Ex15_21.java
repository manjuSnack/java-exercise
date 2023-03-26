
// #15.40 직렬화와 역직렬화 예제 3
// 스트림으로 저장된 파일을 객체로 불러오기

import static java.lang.System.*;
import java.io.*;
import java.util.ArrayList;

public class Ex15_21 {
    public static void main(String[] args) {
        try {
            String fileName = "UserInfo.ser";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream in = new ObjectInputStream(bis);

            // 객체를 읽을 때는 출력한 순서와 일치해야 한다.
            UserInfo u1 = (UserInfo) in.readObject();
            UserInfo u2 = (UserInfo) in.readObject();
            ArrayList list = (ArrayList) in.readObject();

            out.println(u1);
            out.println(u2);
            out.println(list);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
