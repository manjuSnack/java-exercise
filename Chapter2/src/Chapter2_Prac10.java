import java.util.Scanner;

/**
 * 
 * @author manjuSnack
 *
 * Practice 10. 원의 정보를 받기 위해 키보드로부터 원의 중심을 나타내는 한 점과 반지름을 입력받는다.
 * 두 개의 원을 입력받고 두 원이 서로 겹치는지 판단하여 출력하라.
 * 
 */
public class Chapter2_Prac10 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		double x1 = scanner.nextDouble();
		double y1 = scanner.nextDouble();
		double radius1 = scanner.nextDouble();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		double x2 = scanner.nextDouble();
		double y2 = scanner.nextDouble();
		double radius2 = scanner.nextDouble();
		
		// 🍌 피타고라스의 정리 : 직각삼각형에서 빗변 길이의 제곱은 빗변을 제외한 두 변의 각각 제곱의 합과 같다. 
		double distance = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		System.out.println("두 점 간의" + distance);
		if (distance <= radius1+radius2)
			System.out.print("두 원은 서로 겹친다.");
		else
			System.out.print("두 원은 서로 겹치지 않는다.");
		
		scanner.close();
	}

}
