import static java.lang.System.out;

public class Ex8_1 {

	public static void main(String[] args) {
		out.println(1);
		try {
			out.println(2);
			out.println(3);
		} catch (Exception e) {
			out.println(4); // 실행되지 않는다.
		} // try-catch의 끝
		
		out.println(5);
	}

}
