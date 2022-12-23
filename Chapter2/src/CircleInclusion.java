/**
 * 
 * @author manjuSnack
 * 
 * 실습문제 9.
 * 원의 중심을 나타내는 한 점과 반지름을 실수 값으로 입력받아라. 그리고 실수 값으로 다른 점 (x, y)를 입력받아 이 점이 원의 내부에 있는지 판별하여 출력하라.
 *
 */
import java.util.Scanner;

public class CircleInclusion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 중심과 반지름 입력>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		double radius = scanner.nextDouble();
		
		System.out.print("점의 입력>>");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		
		// Math.sqrt는 제곱근 계산
		double distance = Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2)); 
		if (distance < radius)
			System.out.println("점 (" + x2 + ", " + y2 + ")는 원 안에 있다.");
		else 
			System.out.println("점 (" + x2 + ", " + y2 + ")는 원 밖에 있다.");
	}
}
