import java.util.*;
import static java.lang.System.*;

public class Ex10_1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		out.println("이 해의 년도 : "+ today.get(Calendar.YEAR));
		out.println("월(0~11, 0:1월): "+today.get(Calendar.MONTH));
		out.println("이 해의 몇 째 주: "+ today.get(Calendar.WEEK_OF_YEAR));
		out.println("이 달의 몇 째 주: "+ today.get(Calendar.WEEK_OF_MONTH));
		
		// DATE와 DAY_OF_MONTH는 같다.
		out.println("이 달의 몇 일: "+ today.get(Calendar.DATE));
		out.println("이 달의 몇 일: "+ today.get(Calendar.DAY_OF_MONTH));
		out.println("이 해의 몇 일: "+ today.get(Calendar.DAY_OF_YEAR));
		out.println("요일(1~7, 1:일요일): "+today.get(Calendar.DAY_OF_WEEK)); // 1: 일요일, 2:월요일, ... , 7:토요일
		out.println("이 달의 몇 째 요일: "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		out.println("오전_오후(0:오전, 1:오후): "+today.get(Calendar.AM_PM));
		out.println("시간(0~11): "+today.get(Calendar.HOUR));
		out.println("시간(0~23): "+today.get(Calendar.HOUR_OF_DAY));
		out.println("분(0~59): "+today.get(Calendar.MINUTE));
		out.println("초(0~59): "+today.get(Calendar.SECOND));
		out.println("1000분의 1초(0~999): "+today.get(Calendar.MILLISECOND)); 
		out.println("TimeZone(-12+12): "+ (today.get(Calendar.ZONE_OFFSET)/(60*60*1000))); // 3600000를 나눈다. ( 1시간 = 60 * 60 * 1000(1000분의 1초))
		out.println("이 달의 마지막 날: "+today.getActualMaximum(Calendar.DATE));
		
	}

}
