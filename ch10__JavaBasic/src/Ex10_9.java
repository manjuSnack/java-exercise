import java.util.*;
import java.text.*;
import static java.lang.System.*;

public class Ex10_9 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2023년 2월 26일");
            out.println(df2.format(d));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
