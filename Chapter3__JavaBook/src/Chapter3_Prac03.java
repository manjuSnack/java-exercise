import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 *
 * Practice 3. Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라.
 * 다음은 5를 입력받았을 경우이다.
 * 
 */
public class Chapter3_Prac03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>>>");
		
		int n = scanner.nextInt();
		if (n<=0) {
			System.out.println("0보다 커야 합니다.");
			// 입력값 초기화
			scanner.close();
			return; 
		}
		
		for (int i = n; i>0; i--) { // n줄 출력
			for (int j =0; j<i; j++) // i개의 별표를 한 줄에 출력
				System.out.print("*");
			System.out.println();
		}
		scanner.close();
	}

}
