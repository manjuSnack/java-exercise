import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 * 🍘 #ch4-16~19 while문, do-while문
 */
public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1 ~ 100 사이의 임의의 수를 저장
		System.out.println("anser="+answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은 수로 다시 시도해 보세요.");
			} else if (input<answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input!=answer);
		
		// while문의 경우에는 입력을 2개 이상 작성해야 하는 번거로움이 생긴다.
//		System.out.print("1과 100사이의 정수를 입력하세요.>");
//		input = scanner.nextInt();
//		
//		while (input!=answer) {
//			if(input>answer) {
//				System.out.println("더 작은 수로 다시 시도해 보세요.");
//			} else if (input<answer) {
//				System.out.println("더 큰 수로 다시 시도해보세요.");
//			}
//
//			System.out.print("1과 100사이의 정수를 입력하세요.>");
//			input = scanner.nextInt();
//		}
		
		System.out.println("정답입니다.");
	}

}
