/**
 * 
 * @author manjuSnack
 *
 * 예제 4-1. Circle 클래스의 객체 생성 및 활용
 * 
 * 반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체를 생성하라. 
 * 그리고 객체가 생성된 모습을 그려보라. 
 */
public class Circle {
	int radius;  // 원의 반지름 field
	String name; // 원의 이름 field
		
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	// 🍌 예제 4-3을 위한 Constructor 
	public Circle() {
		radius = 1; name = "";
	}
	
	// 🍌 예제 4-3을 위한 Constructor 
	public Circle(int r, String n) {
		radius = r; name = n; // 🍌 Argument variable로 field 초기화
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(); // 🍌 pizza라는 Circle 객체(Object) 생성
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donut = new Circle(); // 🍌 donut이라는 Circle 객체(Object) 생성
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}

}
