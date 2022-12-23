/**
 * 
 * @author manjuSnack
 * 
 * 실습문제 11-1. if-else문을 이용
 * 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,0,1의 경우 겨울, 그 외의 숫자를 입력한 경우 "잘못 입력"을 출력하는 프로그램 작성
 * 
 *
 */
import java.util.Scanner;

public class Chapter2_prac11_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int month = scanner.nextInt();
		if (month >= 3 && month <=5)
			System.out.println("봄");
		else if (month >= 6 && month <= 8)
			System.out.println("여름");
		else if (month >= 9 && month <= 11)
			System.out.println("가을");
		else if (month == 12 || month == 1 || month == 2)
			System.out.println("겨울");
		else
			System.out.println("잘못입력");
		scanner.close();
			
	}

}
