/**
 * 
 * @author manjuSnack
 * 
 * 실습문제 6. 369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고 정수에 3,6,9 중 하나가 있는 경우는
 * "박수 짝"을 출력하고 두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
 * 예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력하면 된다.
 * 
 * 참조 : Chapter 3장. Practice 13번 문제
 */
import java.util.Scanner;

public class Chapter2_prac06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		
		int res, num, length, numberOf369 = 0;
		length = scanner.nextInt();
		String str[] = {" 박수 짝"," 박수 짝짝"};
		
		
		for (int i=1; i<=length; i++) {
			num = i;
			for (res = num % 10; num>0; res = num % 10 ) {
				if (res == 3 || res == 6 || res == 9)
					numberOf369++;
				num = num / 10; // num이 0이 될 때까지 반복, 예를 들어 66인 경우 for문을 2바퀴 돌고 numberOf369의 값은 2가 된다. 
			}
			if (numberOf369 > 0 && i == length)
				System.out.println(str[numberOf369-1]);
			numberOf369 = 0;
		}
		
		scanner.close();
	}
}
