import static java.lang.System.out;

public class Ex7_13 {
	class InstanceInner {}
	static class StaticInner {}
	
	// 인스턴스 멤버 간, static 멤버 간에는 서로 직접 접근이 가능
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner(); static멤버는 인스턴스멤버에 직접 접근할 수 없다.
		StaticInner obj2 = new StaticInner();
	
//		아래와 같이 객체를 생성해 인스턴스 멤버에 접근할 수 있다.
		Ex7_13 outer = new Ex7_13(); // 객체 생성
		InstanceInner obj = outer.new InstanceInner();
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner(); 어느 메서드 내 지역 클래스는 외부에서 접근할 수 없다.
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
