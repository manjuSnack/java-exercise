import java.util.*;
import static java.lang.System.*;

// TreeSet으로 로또번호 만드는 예제 
public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        // TreeSet은 HashSet과는 달리 저장할 때 이미 정렬한다.
        out.println(set);
    }
}
