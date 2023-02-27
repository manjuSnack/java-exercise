import static java.lang.System.*;
import java.util.*;

// 최근에 열어본 문서들의 목록보기
public class Ex11_4 {
    static Queue q = new LinkedList<>();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input))
                    continue;

                if (input.equalsIgnoreCase("q")) {
                    exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    out.println(" help - 도움말을 보여줍니다.");
                    out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    out.printf(" history - 최근에 입력한 명령어를 %d개 보여줍니다.%n", MAX_SIZE);
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0; // 입력받은 명령어 저장
                    save(input);

                    // LinkedList의 내용을 보여준다.
                    LinkedList tmp = (LinkedList) q;
                    ListIterator it = tmp.listIterator();

                    while (it.hasNext())
                        out.println(++i + "." + it.next());
                } else {
                    save(input);
                    out.println(input);
                }
            } catch (Exception e) {
                out.println("입력오류입니다.");
            }
        } // while end
    } // main end

    public static void save(String input) {
        // queue에 저장한다.
        if (!"".equals(input))
            q.offer(input);

        // queue의 최대크기가 넘으면 제일 처음 입력 값은 삭제
        if (q.size() > MAX_SIZE)
            q.remove();
    }
} // end of class
