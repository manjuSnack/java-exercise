import static java.lang.System.out;

public class Ex7_14 {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;	// 외부 클래스의 private멤버도 접근 가능하다.
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
//		int siv = outerIv; 	// static 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
		static int scv = outerCv;
		
		// 객체를 생성하여야 접근할 수 있다.
		Ex7_14 outer = new Ex7_14();
		int siv = outer.outerIv;
	}
	
	void myMethod() {
		int lv = 0;		  // Compiler가 자동으로 final을 붙여준다. 그러나 본래 final이 붙지 않으면 에러가 나는 원리이다.
		final int LV = 0; // JDK1.8부터 final 생략 가능
	
		class LocalInner {
			int liv = outerIv;
			int liv2 = outerCv;
			int liv3 = lv; // 외부 클래스의 지역변수는 final이 붙은 상수만 접근가능. JDK1.8부터 에러가 아니다. 
			int liv4 = LV;
		}
	}
}
