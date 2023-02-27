import static java.lang.System.*;
import java.util.*;

public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
        Set set = new HashSet();

        for (int i = 0; i < objArr.length; i++)
            set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장
        out.println(set);

        Iterator it = set.iterator();

        while (it.hasNext()) {
            out.println(it.next());
        }
    }
}
