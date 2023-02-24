import static java.lang.System.out;

public class Ex9_12 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);
		sb.append('4').append(56);
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);
		
		out.println("sb ="+sb);
		out.println("sb2="+sb2);
		out.println("sb3="+sb3);
		
		out.println("sb ="+sb.deleteCharAt(10));
		out.println("sb ="+sb.delete(3, 6));
		out.println("sb ="+sb.insert(3, "abc"));
		out.println("sb ="+sb.replace(6, sb.length(), "END"));
		
		out.println("capacity="+sb.capacity());
		out.println("length="+sb.length());
		
	}

}
