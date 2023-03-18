
// #14.37 Optional<T>객체의 값 가져오기
import java.util.*;
import static java.lang.System.*;

public class toLearn37 {
    public static void main(String[] args) {
        Optional<String> optVal = Optional.of("abc");
        // String str = optVal.get(); // optVal에 저장된 값이 null이면 예외발생
        String str = optVal.orElse(""); // null 발생 시 orElse에 대체된 값으로 반환

        // null인지 체크하는 if문
        if (str != null) {
            out.println(str);
        }

        // 위의 if문을 간략히
        // of() - 참조변수가 null이면 NullPointerException 발생
        // ofNullable() - 참조변수가 null일 가능성이 있다면 of() 대신 사용
        // isPresent() - null이면 false, null이 아니면 true
        if (Optional.ofNullable(str).isPresent()) {
            out.println(str);
        }

        // 위의 Optional<T>보다 간략히
        // ifPresent() - null이 아닐 경우에만 값을 출력. null이면 아무 일도 일어나지 않는다.
        Optional.ofNullable(str).ifPresent(out::println);
    }
}
