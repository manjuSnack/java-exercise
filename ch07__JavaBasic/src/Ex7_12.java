import static java.lang.System.out;

public class Ex7_12 {

	class InstanceInner {
		int iv = 100;
		static int cv = 100;			// 에러가 나지 않는다. 
		final static int CONST = 100;	// final static은 상수이므로 허용
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
			static int cv = 300;		// 에러가 나지 않는다.
			final static int CONST = 300;
		}
	}
	
	public static void main(String[] args) {
		out.println(InstanceInner.CONST);
		out.println(InstanceInner.cv);
		out.println(StaticInner.cv);
	}

}
