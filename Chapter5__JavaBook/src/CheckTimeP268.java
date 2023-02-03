/**
 * 
 * @author manjuSnack
 *
 * CheckTimeP268. 
 * (1) 서브 클래스의 생성자에서 슈퍼클래스의 생성자를 호출할 때 사용하는 자바의 키워드는? super()
 * (2) 아래의 코드를 실행하면 그 결과는 무엇인가?
 * (3) 다음은 서브 클래스 B의 생성자 코드이다. 잘못된 부분은? super()가 생성자(Constructor) 첫 라인에 있지 않다.
 */
class A{
	public A() {
		System.out.println("생성자 A");
	}
	public A(int x) {
		System.out.println("매개변수생성자A " + x);
	}
}

class B extends A {
	public B() {
		super(30);
		System.out.println("생성자 B");
	}
	public B(int x) {
		System.out.println("매개변수생성자B" + x);
	}
}

public class CheckTimeP268 {

	public static void main(String[] args) {
		B b;
		b = new B();

	}

}
