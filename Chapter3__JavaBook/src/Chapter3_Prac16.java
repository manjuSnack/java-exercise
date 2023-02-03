import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 *
 * Practice 16. 컴퓨와 독자 사이의 가위, 바위, 보 게임을 만들어 보자. 예시는 다음 그림과 같다.
 * 독자부터 먼저 시작한다. 독자가 가위, 바위, 보 중 하나를 입력하고 <Enter>키를 치면, 프로그램은
 * 가위, 바위, 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸 것으로 한다. 
 * 독자가 입력한 값과 랜덤하게 선택한 값을 비교하여 누가 이겼는지 판단한다.
 * 독자가 가위, 바위, 보 대신 "그만"을 입력하면 게임은 끝난다.
 * 
 * 참고 : Chapter3 실습문제 14번, Chapter2 Open Challenge.
 */
public class Chapter3_Prac16 {
	
	/*
	 * 🍨 두 가지 반복문에 따른 두 가지 검증할 변수 추가.
	 * 1. typingCheck : user가 입력할 값을 검증. 
	 * 2. gbbCheck : user와 computer의 가위, 바위, 보의 승부결과를 검증.   
	 * */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str [] = {"가위", "바위", "보"};
	
		System.out.println("컴퓨터와 가위,바위,보 게임을 합니다.");
		while(true) {
			System.out.print("가위 바위 보!>>");
			String user = scanner.next();
			
			// 🍥 게임 종료 Handle
			if (user.equals("그만")) {
				System.out.print("게임을 종료합니다...");
				break;
			}
			
			// 🍥 user가 입력한 값을 확인하며 True이면 계속 진행, false이면 다시 입력값을 요구하는 Handle
			boolean typingCheck = false;
			for (int i =0; i<str.length; i++) {
				if (user.equals(str[i]))
					typingCheck = true; 
			}
			
			if (typingCheck == false)
				System.out.println("찌바?! 다시 입력하라냥!");
			
			
			// 🍥 Computer의 입력
			int n = (int)(Math.random()*3);
			
			// 🍥 0일 경우 비김, 1일 경우 사용자가 승, 2일 경우 컴퓨터가 승.
			int gbbCheck = 0; 
			
			// 🍥 Computer와 user의 패의 따라 승자를 가려내는 Handle. 비슷한 조건을 반복하므로 switch문을 이용하였다.
			if(str[n].equals("가위")) {
				switch (user) {
				case "가위" : gbbCheck = 0; break;
				case "바위" : gbbCheck = 1; break;
				case "보" : gbbCheck = 2; break;				
				}
			} else if (str[n].equals("바위")) {
				switch (user) {
				case "가위" : gbbCheck = 2; break;
				case "바위" : gbbCheck = 0; break;
				case "보" : gbbCheck = 1; break;				
				}
			} else 	{ // PC가 "보"
				switch (user) {
				case "가위" : gbbCheck = 1; break;
				case "바위" : gbbCheck = 2; break;
				case "보" : gbbCheck = 0; break;				
				}
			}
			
			// 🍥 가려낸 승자에 따른 출력값을 만드는 Handle
			if (gbbCheck == 0 && typingCheck == true) 
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[n] + ", " + "비겼습니다.");
			else if (gbbCheck == 1 && typingCheck == true)
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[n] + ", " + "사용자가 이겼습니다.");
			else if (gbbCheck == 2 && typingCheck == true)
				System.out.println("사용자 = " + user + " , 컴퓨터 = " + str[n] + ", " + "컴퓨터가 이겼습니다.");
			
		}
		scanner.close();
	}
	
}