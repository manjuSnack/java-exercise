/**
 * 
 * @author manjuSnack
 * 
 * 실습문제 1.
 * Scanner 클래스를 이용하여 원화를 입력받아 달러로 바꾸어 다음 예시와 같이 출력하는 프로그램을 작성하라. $1=1100원으로 가정하고 계산하라
 *
 */
import java.util.Scanner;

public class Chapter2_prac01 {

	public static void main(String[] args) {
		final double rate = 1100.0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요(단위 원)>> ");
		int won = scanner.nextInt();
		
		double dollar = won/rate;
		System.out.println(won + "원은 " + dollar + "입니다. ");
		scanner.close();
	}

}
