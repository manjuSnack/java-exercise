import static java.lang.System.out;

public class Ex9_3 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		out.println(str1.equals(str2));
		out.println(str1.hashCode());
		out.println(str2.hashCode());
		out.println(System.identityHashCode(str1));
		out.println(System.identityHashCode(str2));		
	}
}
