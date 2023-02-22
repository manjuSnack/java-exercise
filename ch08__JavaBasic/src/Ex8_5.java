import static java.lang.System.out;

public class Ex8_5 {

	public static void main(String[] args) {
		out.println(1);
		out.println(2);
		
		try {
			out.println(3);
			out.println(0/0);	// 예외발생!
			out.println(4);		// 실행되지 않는다.
		} catch( ArithmeticException ae ) {
			ae.printStackTrace();	// 참조변수 ae를 통해 ArithmeticException 인스턴스에 접근하여 메서드 정보와 예외 메시지 출력
			out.println("예외메시지 : " + ae.getMessage()); // / by zero가 저장된 메시지
		} // try-catch의 끝
		
		out.println(6);
	}

}
