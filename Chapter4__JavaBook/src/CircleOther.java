/**
 * 
 * @author manjuSnack
 * 
 * 예제 4-3. 두 개의 생성자를 가진 Circle 클래스
 * 
 * 다음 코드는 2개의 생성자를 가진 Circle 클래스이다. 실행 결과는 무엇인가?
 * 
 */
public class CircleOther extends Circle {

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자");
		
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		Circle donut = new Circle(); // 객체(Object) 생성. 반지름을 1, 이름을 ""로 초기화
		donut.name = "도넛피자"; // 이름변경
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
