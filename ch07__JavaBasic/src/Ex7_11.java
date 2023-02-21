import static java.lang.System.out;

public class Ex7_11 {

	public static void main(String[] args) {
		Child3 c = new Child3();
		c.method1();
		c.method2(); // 조상클래스의 method가 상속되고 default method는 무시된다.
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {
	public void method1() {
		out.println("method1() in Child3"); // overriding
	}
}

class Parent3 {
	public void method2() {
		out.println("method2() in Parent3");
	}
}

interface MyInterface {
	default void method1() {
		out.println("method1() in MyInterface");
	}
	
	default void method2() {
		out.println("method2() in MyInterface");
	}
	
	static void staticMethod() {
		out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	default void method1() {
		out.println("method1() is MyInterface2");
	}
	
	static void staticMethod() {
		out.println("staticMethod() is MyInterface2");
	}
}
