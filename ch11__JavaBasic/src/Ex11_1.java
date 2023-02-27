import java.util.*;
import static java.lang.System.*;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // list1과 list2를 정렬
        Collections.sort(list1); // Collection은 인터페이스(Interface), Collections는 클래스(Class)
        Collections.sort(list2);
        print(list1, list2);

        out.println("list1.containsAll(list2) :" + list1.contains(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // index가 3인 위치에 "A"를 추가
        print(list1, list2);

        list2.set(3, "AA"); // index가 3인 위치에 "AA"로 변경
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지 삭제
        out.println("list1.retainAll(list2):" + list1.retainAll(list2));

        print(list1, list2);

        // list2에서 list1에 포함된 객체들 삭제
        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    } // main end

    static void print(ArrayList list1, ArrayList list2) {
        out.println("list1:" + list1);
        out.println("list2:" + list2);
        out.println();
    }
}
