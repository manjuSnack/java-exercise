/**
 * 
 * @author manjuSnack
 *
 *  가위바위보 게임
 */
import java.util.Scanner;

public class GBBGameApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String a = scanner.next();
		
		System.out.print("영희 >> ");
		String b = scanner.next();
		
		if (a.equals("가위")) {
			if(b.equals("가위")) 
				System.out.println("비겼습니다.");
			
			else if (b.equals("바위")	)
				System.out.println("영희가 이겼습니다.");
			else
				System.out.println("철수가 이겼습니다.");
		}
		
		else if (a.equals("바위")) {
			if(b.equals("가위"))
				System.out.println("철수가 이겼습니다.");
			else if (b.equals("바위"))
				System.out.println("비겼습니다.");
			else 
				System.out.println("영희가 이겼습니다.");
		}
		else { 
			if (b.equals("가위"))
				System.out.println("영희가 이겼습니다.");
			else if (b.equals("바위"))
				System.out.println("철수가 이겼습니다.");
			else
				System.out.println("비겼습니다.");			
		}
	}

}
