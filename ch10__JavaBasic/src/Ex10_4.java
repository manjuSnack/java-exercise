import java.util.*;
import static java.lang.System.out;

public class Ex10_4 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2023, 2, 25);	// 2023년 2월 25일
		out.println(toString(date));
		
		out.println("= 1일 후 =");
		date.add(Calendar.DATE, 1);
		out.println(toString(date));
		
		out.println("= 6달 전 =");
		date.add(Calendar.MONTH, -6);
		out.println(toString(date));
		
		out.println("= 31일 후(roll) =");
		date.roll(Calendar.DATE, 31);
		out.println(toString(date));
		
		out.println("= 31일 후(add) =");
		date.add(Calendar.DATE, 31);
		out.println(toString(date));
		
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일"; 
	}

}
