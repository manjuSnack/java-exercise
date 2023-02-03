/**
 * 
 * @author manjuSnack
 * 
 * Example 2-2 variable, literal, final 활용
 * 상수 PI를 선언하고 원의 면적을 구하는 프로그램을 작성하라.
 *
 */
public class CircleArea {
	public static void main (String[] args) {
		final double PI = 3.14;
		
		double radius = 10.0;
		double circleArea = radius*radius*PI;
		
		System.out.println("원의 면적 = "+ circleArea);
		
	}
}
