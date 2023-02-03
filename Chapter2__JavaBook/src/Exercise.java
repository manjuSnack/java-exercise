/**
 * 
 * @author manjuSnack
 * 
 * Exercise4 연습문제 4, 6, 8, 10, 12, 14 풀이
 *
 */
import java.util.Scanner;
public class Exercise {
			// Exercise 4 문제.
			// (1) int형 변수 height
			int height = 95;
			
			// (2) 0.25로 초기화된 double형 변수 size
			double size = 0.25;
			
			// (3) height 변수 값과 size 변수의 값을 더한 값으로 초기화된 double형 변수 total
			double total = (size + (double)height);
			
			// (4) 문자 'a'로 초기화된 char형 변수 c
			char c = 'a';
			
			// (5) 자신의 이름으로 초기화된 문자열 변수 name
			String name = "manjuSnack";
			
			// Exercise 6 문제. 체온 값 36.5로 초기화된 상수 bodyTemp를 double형으로 선언하라.
			double bodyTemp = 36.5;
			
			/* Exercise 8 문제.	
			 if (age >= 12) 
			 if (age <= b && age >= c)
			 if ((age - 5) == 10)
			 if (age != b || age == c)
			 */
			
			
	public static void main(String[] args) {
		// Exercise 10 문제. 다음 조건문을 조건 연산자를 이용하여 한 문장으로 작성하라.
		int n = 6; // 임의로 변수 값을 줌.
		System.out.println((n>5) ? n : 5);
		
		// Exercise 12 문제. 다음 출력문에 의해 출력되는 텍스트는 무엇인가?
		System.out.println("나는 \"Java를 " + 100 + "%\"" + "사랑해");
		
	
		// Exercise 14 문제. if문을 switch 문으로 바꾸어라.
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위, 바위, 보 중 하나를 입력하세요.");
		String in = scanner.next();
		
		switch (in) {
		
		case "가위":
			System.out.println(1);
			break;
		case "바위":
			System.out.println(2);
			break;
		case "보":
			System.out.println(3);
			break;
		default:
			System.out.println(0);
		}
	}
}

