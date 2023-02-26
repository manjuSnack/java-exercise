import java.util.*;
import java.text.*;
import static java.lang.System.*;

public class Ex10_10 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);

        Date inDate = null;

        out.printf("날짜를 %s의 형태로 입력해주세요.(입력예:2023/02/26)%n", pattern);

        while (s.hasNextLine()) {
            try {
                inDate = df.parse(s.nextLine());
                break;
            } catch (Exception e) {
                out.printf("날짜를 %s의 형태로 다시 입력해주세요.(입력예:2023/02/26)%n", pattern);
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);
        out.printf("입력하신 날짜는 현재와 %s 시간 차이가 있습니다.", day);
    }
}
