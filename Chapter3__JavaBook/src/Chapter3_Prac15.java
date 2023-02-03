import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 *
 * Practice 15. 다음은 2개의 정수를 입력받아 곱을 구하는 Multiply 클래스이다.
 * 
 * 
 */
public class Chapter3_Prac15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("곱하고자 하는 두 수 입력>>");
			try {
				int n = scanner.nextInt();
				int m = scanner.nextInt();
				System.out.print(n + "x" + m + "=" + n*m);
				break;
			} catch(InputMismatchException e) {
				System.out.println("실수는 입력하면 안됩니다.");
				scanner.nextLine();
				continue;
			}
		} while(true);
		
		scanner.close();
	}

}
