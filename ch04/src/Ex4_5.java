import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-5~8, if-else if문과 중첩 if문
 */
public class Ex4_5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = 'C', opt = '0';
		
		System.out.print("점수를 입력해주세요.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) opt = '+';
			else if (score < 94) opt = '-';
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) opt = '+';
			else if (score < 84) opt = '-';
		} 
//		else grade = 'C'; refactoring으로 else값을 주지 않고 grade를 'C'로 초기화한다.
		
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}
