/**
 * 
 * @author manjuSnack
 *
 * Example 3-6 break문을 이용하여 while문 벗어나기
 * "exit"이 입력되면 while문을 벗어나도록 break문을 활용하는 프로그램을 작성하라.
 * 
 */
import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("종료합니다.");
		scanner.close();
	}

}
