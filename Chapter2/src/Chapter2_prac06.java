/**
 * 
 * @author manjuSnack
 * 
 * 실습문제 6.
 * 
 * 369 게임
 *
 */
import java.util.Scanner;

public class Chapter2_prac06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수를 입력하시오>> ");
		int num = scanner.nextInt();
		int tensPlace = num/10;
		int onesPlace = num%10;
		
		if ((tensPlace == 3 || tensPlace == 6 || tensPlace == 9) && (tensPlace == 3 || tensPlace == 6 || tensPlace == 9)) 
			System.out.println("박수짝짞");
		else if ((onesPlace == 3 || onesPlace == 6 || onesPlace == 9) || (onesPlace == 3 || onesPlace == 6 || onesPlace == 9))
			System.out.println("박수짝");
		scanner.close();
	}
}
