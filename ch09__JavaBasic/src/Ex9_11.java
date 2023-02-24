import static java.lang.System.out;

public class Ex9_11 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		out.println(sb);
		out.println(sb2);
		out.println(sb.toString());
		out.println(sb2.toString());
		out.println("sb == sb2 ? " + (sb == sb2));
		out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		// StringBuffer의 내용을 String으로 변환한다.
		String s = sb.toString();
		String s2 = sb2.toString();
		
		out.println("s.equals(s2) ? " + s.equals(s2));
	}

}
