import static java.lang.System.out;

public class Ex8_4 {

	public static void main(String[] args) {
		out.println(1);
		out.println(2);
		try {
			out.println(3);
			out.println(args[0]); // ArrayIndexOutOfBoundsException 발생
			out.println(0/0);
			out.println(4);
		} catch( ArithmeticException ae ) {
			if (ae instanceof ArithmeticException)
				out.println("true");
			out.println("ArithmeticException");
		} catch (Exception e) {
			out.println("Exception");
		}
		out.println(6);
	}
}
