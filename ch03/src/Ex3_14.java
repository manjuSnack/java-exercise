/**
 * 
 * @author manjuSnack
 *
 * 🍘 #Ch3-13~14, 비교 연산자, 문자열의 비교
 */
public class Ex3_14 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf(" \"abc\"==\"abc\" ? %b%n", "abc" == "abc"); //  "abc"=="abc" ? true
		System.out.printf(" str1==\"abc\" ? %b%n", str1 == "abc"); //   str1=="abc" ? true
		System.out.printf(" str2==\"abc\" ? %b%n", str2 == "abc"); //   str2=="abc" ? false 에는 new 연산자를 이용하면 값이 에러가 발생한다.
		System.out.printf(" str1.equals(\"abc\") ? %b%n", str1.equals("abc")); //  str1.equals("abc") ? true
		System.out.printf(" str1.equals(\"abc\") ? %b%n", str2.equals("abc")); //  str1.equals("abc") ? true
		System.out.printf(" str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); //   str2.equals("ABC") ? false 
		System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); //  str2.equalsIgnoreCase("ABC") ? true  
		
	}

}
