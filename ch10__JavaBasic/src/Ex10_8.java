import java.util.*;
import java.text.*;
import static java.lang.System.out;

class Ex10_8 {

    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yyyy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
        sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
        sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 날입니다.");
        sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 날입니다.");
        sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");

        out.println(sdf1.format(today));
        out.println(sdf2.format(today));
        out.println(sdf3.format(today));
        out.println(sdf4.format(today));
        out.println();
        out.println(sdf5.format(today));
        out.println(sdf6.format(today));
        out.println(sdf7.format(today));
        out.println(sdf8.format(today));
        out.println(sdf9.format(today));

    }
}

/*
 * 결과
 * 2023-02-26
 * 2023년 2월 26일 일요일
 * 2023-02-26 13:41:00.970
 * 2023-02-26 01:41:00 오후
 * 
 * 오늘은 올 해의 57번째 날입니다.
 * 오늘은 이 달의 26번째 날입니다.
 * 오늘은 올 해의 9번째 날입니다.
 * 오늘은 이 달의 5번째 날입니다.
 * 오늘은 이 달의 4번째 일요일입니다.
 */