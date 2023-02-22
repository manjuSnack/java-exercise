import static java.lang.System.out;

public class Ex8_3 {

	public static void main(String[] args) {
		out.println(1);
		out.println(2);
		
		try {
			out.println(3);
			out.println(0/0);
			out.println(4); // 실행되지 않는다.
		} catch ( Exception e ) {
			out.println(5);
		} // try-catch의 끝
		out.println(6);
	} // main메서드의 끝

}
