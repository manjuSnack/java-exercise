import static java.lang.System.*;
import java.util.*;

public class Ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList(); // Queue인터페이스 구현 시 LinkedList( ) 사용

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        out.println("= Stack =");
        while (!st.empty())
            out.println(st.pop()); // Stack에서 요소(Node) 하나를 꺼내서 출력

        out.println("= Queue =");
        while (!q.isEmpty())
            out.println(q.poll()); // Queue에서 요소(Node) 하나를 꺼내서 출력
    }
}
