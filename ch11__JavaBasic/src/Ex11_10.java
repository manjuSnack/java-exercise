import static java.lang.System.*;
import java.util.*;

// HashSet으로 로또번호 만드는 예제 
public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set); // LinkedList(Collection c)
        Collections.sort(list); // Collection.sort(List list)
        out.println(list);
    }
}
