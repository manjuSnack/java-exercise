import static java.lang.System.out;

public class Ex9_6 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		out.println("String str1 = \"abc\";");
		out.println("String str2 = \"abc\";");
		
		out.println("str1.toString : " + str1.toString());
		out.println("str2.toString : " + str2.toString());
		
		out.println("str1 == str2 ? " + (str1 == str2));
		out.println("str1.equals(str2) ? " + str1.equals(str2));
		out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		out.println("String str3 = new String(\"abc\");");
		out.println("String str4 = new String(\"abc\");");
		out.println("str3 == str4 ? " + (str3 == str4));
		out.println("str3.equals(str4) ? " + str3.equals(str4));
	}

}
