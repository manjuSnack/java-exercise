/**
 * 
 * @author manjuSnack
 *
 * 예제 4-6. Circle 객체 배열 만들기
 * 반지름이 0~4인 Circle 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle 객체의 면적을 출력하라.
 */
class Circle46 { // Circle Class 중복으로 인한 Circle 예제 4-6이라는 뜻으로 작성하였다.
	int radius;
	public Circle46(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {

	public static void main(String[] args) {
		Circle46 [] c; // Circle 배열에 대한 Reference c 선언
		c = new Circle46[5]; // 5개의 Reference 배열 생성
		
		for (int i=0; i<c.length; i++) // 배열의 개수만큼
			c[i] = new Circle46(i); // i 번째 원소 객체 생성
		
		for (int i=0; i<c.length; i++) // 배열의 모든 Circle 객체의 면적 출력
			System.out.print((int)(c[i].getArea()) + " ");
	}

}
