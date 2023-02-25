import java.util.*;
import static java.lang.System.out;

public class Ex10_2 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
//		month의 경우 0부터 시작, 4월은 3으로 지정
//		date1.set(2023, 1, 25); // 2023년 2월 25일
		date1.set(2023, Calendar.FEBRUARY, 25);
		out.println("date1은 "+ toString(date1) + " " + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
		out.println("오늘(date2)은 " + toString(date2) + " " + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
		
//		두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
		out.println("그 날(date1)부터 지금(date2)까지 "+difference+"초가 지났습니다.");
		out.println("일(day)로 계산하면 "+difference/(24*60*60)+"일입니다."); // 1일 = 24 * 60 * 60
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + date.get((Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일"; 
	} 

}
