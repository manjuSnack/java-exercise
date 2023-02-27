import static java.lang.System.*;
import java.util.*;

public class Ex11_3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            out.println("Usage: java Ex11_3 \"EXPRESSION\"");
            out.println("Example: java Ex11_3 \"((2+3)*1)+3\"");
            exit(0);
        }

        Stack st = new Stack();
        String expression = args[0];

        out.println("expression:" + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    st.push(ch + "");
                } else if (ch == ')') {
                    st.pop();
                }
            }

            if (st.isEmpty()) {
                out.println("괄호가 일치합니다.");
            } else {
                out.println("괄호가 일치하지 않습니다.");
            }

        } catch (Exception e) {
            out.println("괄호가 일치하지 않습니다.");
        } // try end
    }
}
