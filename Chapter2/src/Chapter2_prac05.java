/**
 * 
 * @author manjuSnack
 * 
 * 실습문제 5.
 * Scanner를 이용하여 삼각형의 변의 길이를 나타내는 정수를 3개 입력받고 이 3개의 수로 삼각형을 만들 수 있는지 판별하라. 삼각형이 되려면 두 변의 합이 다른 한 변의 합보다 커야 한다.
 *
 */
import java.util.Scanner;

public class Chapter2_prac05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개를 입력하시오>>");
		int l1 = scanner.nextInt();
		int l2 = scanner.nextInt();
		int l3 = scanner.nextInt();
		
		if ((l1+l2)<l3 || (l1+l3)<l2 || (l2+l3)<l1)
			System.out.println("삼각형을 만들 수 없습니다.");
		else 
			System.out.println("삼각형이 됩니다.");
		scanner.close();
	}

}
