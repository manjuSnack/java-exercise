/**
 * 
 * @author manjuSnack
 *
 * 예제 5-2. 상속 관계에 있는 클래스 간 멤버 접근
 * 클래스 Person을 아래와 같은 필드를 갖도록 선언하고, 클래스 Student는 Person을 상속받아 각 멤버 필드에 값을 저장하라.
 * 
 * private int weight;
 * int age;
 * protected int height;
 * public String name;
 * 
 * 이 예제에서 Person 클래스의 private 필드인 weight는 Student 클래스에서는 접근이 불가능하여
 * 슈퍼 클래스인 Person의 get, set 메소드를 통해서만 조작이 가능하다.
 */

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99; Super Class의 private 멤버 접근 불가
		setWeight(99);
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
