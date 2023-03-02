import static java.lang.System.*;
import java.util.*;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        out.println("참가자 명단 : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while (it.hasNext()) {
            int i = (int) it.next();
            total += i;
        }

        out.println("총점 : " + total);
        out.println("평균 : " + (float) total / set.size());
        out.println("최고점수 : " + Collections.max(values));
        out.println("최저점수 : " + Collections.min(values));
    }
}
