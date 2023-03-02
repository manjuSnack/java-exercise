import static java.lang.System.*;
import java.util.*;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234"); // 이미 존재하는 키에 추가가능하며 기존 값에 덮어씌어진다.

        Scanner s = new Scanner(System.in); // 화면으로부터 라인 단위로 입력

        while (true) {
            out.println("id와 password를 입력해주세요.");
            out.print("id:");
            String id = s.nextLine().trim(); // trim( )은 양쪽 공백을 삭제

            out.print("password :");
            String password = s.nextLine().trim();
            out.println();

            if (!map.containsKey(id)) {
                out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            if (!(map.get(id).equals(password))) {
                out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        } // while
    } // main
}
