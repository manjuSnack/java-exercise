/**
 * 
 * @author manjuSnack
 * 
 * Example 2-12 다중 if-else로 학점 매기기
 * 다중 if-else문을 이용하여 입력받은 성적에 대해 학점을 부여하는 프로그램을 작성하라.
 *
 */
import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100): ");
		int score = scanner.nextInt();
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("학점은 " + grade + "입니다.");
		
		scanner.close();
	}
}
