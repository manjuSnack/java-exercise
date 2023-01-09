import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 *
 * Example 3-15. 0으로 나눌 때 발생하는 ArithmethicException 예외처리
 * try-catch 블록을 이용하여 예제 3-14를 수정하여, 정수를 0으로 나누는 경우에 "0으로 나눌 수 없습니다!"를 출력하고
 * 다시 입력 받는 프로그램을 작성하라.
 * 
 */
public class DevideByZeroHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			System.out.print("나뉨수를 입력하시오:");
			int dividend = scanner.nextInt();
			System.out.print("나눗수를 입력하시오:");
			int divisor = scanner.nextInt();
			try {
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}
		scanner.close();
	}

}
