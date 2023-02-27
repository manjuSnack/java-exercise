import java.util.*;
import static java.lang.System.*;

public class Ex11_5 {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // hashSet( ), TreeSet( ) 또한 Collection Interface의 자손이기에
        // 참조변수를 Collection으로 하면 유연하다.
        Collection c = new ArrayList();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator(); // 1회용

        while (it.hasNext()) {
            Object obj = it.next();
            out.println(obj);
        }

        // 위의 while문을 for문으로 꾸밀 시. 단, HashSet( )으로 바꿀 경우 .get( )가 없어 Error가 발생!
        // for (int i = 0; i < c.size(); i++) {
        // Object obj = c.get(i);
        // out.println(obj);
        // }
    }
}
