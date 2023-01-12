import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 *
 * Practice 8. 2차원 평면에서 직사각형은 문제 7번처럼 두 점으로 표현된다. 
 * 키보드로부터 직사각형을 구하는 두 점 (x1, y1), (x2, y2)를 입력받아 
 * (100, 100), (200, 200)의 두 점으로 이루어진 직사각형과 충돌하는지 판별하는 프로그램을 작성하라.
 */
public class Chapter2_Prac08 {
	
	// 🍌 Hint로 주어진 Method를 활용	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x1, y1, x2, y2;
				
		System.out.print("점 (x1, y1), (x2, y2)의 좌표를 입력하시오>>");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		
		int rectx1 = 100, recty1 = 100;
		int rectx2 = 200, recty2 = 200;
		
		// 🍌 직사각형의 범위를 산정
		boolean dot1 = inRect(x1, y1, rectx1, recty1, rectx2, recty2);
		boolean dot2 = inRect(x1, y1, rectx1, recty1, rectx2, recty2);
		
		// 🍌 검증
		if (dot1 == true && dot2 == true)
			System.out.println("두 사각형은 서로 겹친다.");
		else 
			System.out.println("두 사각형은 서로 겹치지 않는다.");
		
		scanner.close();
	}
}
