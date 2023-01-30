/**
 * 
 * @author manjuSnack
 * 🍘 #ch5-14~15, String 클래스
 */
public class Ex5_6_tmp2 {

	public static void main(String[] args) {
		// index :    012345
		String str = "ABCDE";
		char ch = str.charAt(4);
		System.out.println(ch); // E
		
		String str2 = str.substring(1,4); // 1~3
		System.out.println(str2); // "BCD"
		
		String str3 = str.substring(1); // (int from, int to)의 int to를 생략하는 것과 아래 str.length()로 작성하는 것은 같은 출력이 나온다.
		String str4 = str.substring(1, str.length()); // 1~4
		System.out.println(str3); // "BCDE"
		System.out.println(str4); // "BCDE"
		
	}

}
