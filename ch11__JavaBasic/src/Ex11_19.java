import static java.lang.System.*;
import static java.util.Collections.*;
import java.util.*;

public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        out.println(list);

        addAll(list, 1, 2, 3, 4, 5); // import static ~으로 인해 Collections.addAll( ) → addAll( )
        out.println(list);

        rotate(list, 2); // 반시계방향으로 2칸씩 이동
        out.println(list);

        swap(list, 0, 2); // 첫 번째 0과 세번째 2를 교환(swap)
        out.println(list);

        shuffle(list); // 요소의 위치를 임의로 섞기
        out.println(list);

        sort(list, reverseOrder()); // 내림차순으로 정렬. reverse(list);와 동일
        out.println(list);

        sort(list); // 오름차순으로 정렬
        out.println(list);

        int idx = binarySearch(list, 3); // 3이 저장된 index를 반환
        out.println(" index of 3 = " + idx);

        out.println("max=" + max(list)); // 저장된 요소 중 최대값
        out.println("min=" + min(list)); // 저장된 요소 중 최소값
        out.println("min=" + max(list, reverseOrder())); // 저장된 요소 중 최대값의 반대되는 값

        fill(list, 9); // list를 9로 채운다.
        out.println("list=" + list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다, 단 결과는 변경불가
        List newList = nCopies(list.size(), 2);
        out.println("newList=" + newList);

        out.println(disjoint(list, newList)); // 공통 값인 요소가 없으면 true

        copy(list, newList); // newList의 요소를 복사해 list에 붙여넣는다.
        out.println("newList=" + newList);
        out.println("list=" + list);

        replaceAll(list, 2, 1); // list에 요소 중 2를 1로 바꾼다.
        out.println("list=" + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        out.println("list2=" + list2);
    }
}
