import static java.lang.System.out;

public class Ex8_2 {

	public static void main(String[] args) {
		out.println(1);
		try {
			out.println(0/0);
			out.println(2); // 실행되지 않는다.
		} catch ( ArithmeticException e ) {
			out.println(3);
		} // try-catch의 끝
		out.println(4);
	} // main메서드의 끝

}
