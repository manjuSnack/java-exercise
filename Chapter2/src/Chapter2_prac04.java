/**
 * 
 * @author manjuSncak
 * 
 * 실습문제 4.
 * Scanner 클래스로 정수 3개를 입력받고 3개의 숫자 중 중간 크기의 수를 출력하라. 평균값을 구하는 것이 아님에 주의하라.
 *
 */
import java.util.Scanner;

public class Chapter2_prac04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력>>>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		if (num1 < num2 && num2 < num3)
			System.out.println("중간 값은 " + num2);
		else if (num2 < num3 && num3 < num1)
			System.out.println("중간 값은 " + num3);
		else 
			System.out.println("중간 값은 " + num1);
		scanner.close();
		
	}

}
