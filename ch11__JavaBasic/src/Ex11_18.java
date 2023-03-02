import static java.lang.System.*;
import java.util.*;

public class Ex11_18 {
    public static void main(String[] args) {
        String[] data = { "A", "K", "A", "K", "D", "K", "A", "K", "K", "K", "Z", "D" };

        HashMap map = new HashMap();

        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                int value = (int) map.get(data[i]);
                map.put(data[i], value + 1); // 기존에 있는 키에는 값에 1을 더해서 저장
            } else {
                map.put(data[i], 1); // 기존에 없는 키에는 값을 1로 바꿔 저장
            }
        }

        // Set set = map.entrySet();
        // Iterator it = set.iterator() 의 두 문장이 아래의 한 문장으로
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = (int) entry.getValue();
            // out.println(entry.getKey() + ":" + printBar('#', value) + " " + value);
            out.printf("%s : %s %d%n", entry.getKey(), printBar('#', value), value);
        }

    } // main

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for (int i = 0; i < bar.length; i++)
            bar[i] = ch;

        return new String(bar);
    }
}
