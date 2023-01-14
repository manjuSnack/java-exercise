/**
 * 
 * @author manjuSnack
 *
 * 예제 5-4. instanceof 연산자 활용
 * instanceof 연산자를 이용하여 상속 관계에 따라 Reference가 가리키는 객체(Object)의 타입(Type)을 알아본다.
 * 실행 결과는 무엇인가?
 */
// class 이름에 54를 붙인 건 Class 중복으로 인해 예제 5-4를 일컫는 뜻으로 바꿔 작성.
class Person54 {}
class Student54 extends Person54 {} // upcasting
class Researcher extends Person54 {} // upcasting
class Professor extends Researcher {} // upcasting

public class InstanceOfEx {
	static void print(Person54 p) {
		if(p instanceof Person54)
			System.out.print("Person54 ");
		if(p instanceof Student54)
			System.out.print("Student54 ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	
	public static void main(String[] args) { 
		System.out.print("new Student54() -> \t"); print(new Student54());
		System.out.print("new Researcher() -> \t"); print(new Researcher());
		System.out.print("new Professor() -> \t"); print(new Professor()); // new Professor()는 Person, Researcher, Professor Type이기도 하다.
	}
}
