import static java.lang.System.out;

public class Ex8_9 {

	public static void main(String[] args) throws Exception {
//		method1();  예외발생
		
		try {
			method1();
		} catch (Exception e) {
			out.println("--");
		}
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
		
	}

}
