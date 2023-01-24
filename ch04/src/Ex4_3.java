import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-1~4, 조건문if문과 if-else문
 */
public class Ex4_3 {

	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else { // input!=0인 경우
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	} // main의 끝

}
